class Solution {
    public int[] sortArray(int[] nums) {
       int max = 0;
       int min = 0;

       for(int num : nums)
       {
        max=Math.max(num,max);
        min=Math.min(num,min);
       }

      Map<Integer,Integer> mp = new HashMap<>();
      for(int num : nums)
      {
      if(mp.containsKey(num))
      {
        mp.put(num,mp.get(num)+1);
      }
      else
        mp.put(num,1);
      }


      int j=0;
      for(int i=min; i<=max;i++)
      {
        Integer freq = mp.get(i);
        if(freq!= null)
          {
            for(int k=0; k<freq ;k++)
            {
                nums[j]=i;
                j++;
            }
          }
      }

     return nums;

    }
}