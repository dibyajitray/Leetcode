class Solution {
    public int maximumLength(int[] nums) {

        int c_even = 0;
        int c_odd = 0;
        
        int alt = 1;
        for(int num : nums)
        {
            if( num%2 == 0)
              c_even ++;
            
            else if( num%2 == 1)
             c_odd ++;
        }
         
        int prev_parity = nums[0] % 2;

        for(int i=1;i<nums.length;i++)
        {
           int curr_parity = nums[i] %2;
           if(prev_parity != curr_parity)
           {
             alt ++;
             prev_parity = curr_parity;
           }
        }

         return Math.max(Math.max(c_even,c_odd),alt);
    }
}