class Solution {
    public int maximumScore(int[] nums, int k) {
        
      int i,j;
      i=j=k;
      int currmin = nums[k];
      int result = nums[k];

      while(i>0 || j<nums.length-1)
      {
        int leftval = (i>0) ? nums[i-1] : 0;  // take the value left of k
        int rightval = (j<nums.length-1) ? nums[j+1] : 0;// take the value right of k
        // like(3,7,5) -> left=3 and right =5
        //checking which is bigger according to the algo
        if(rightval > leftval )
        {
            j++;
            currmin = Math.min(currmin,nums[j]);
        }
        else
        {
           i--;
           currmin = Math.min(currmin,nums[i]);
        }

        result = Math.max(result,currmin*(j-i+1));
      }

return result;
    }
}