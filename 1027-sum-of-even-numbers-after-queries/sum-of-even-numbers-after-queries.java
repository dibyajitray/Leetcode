class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

        int size = queries.length;
        int result [] =new int [size];
        int evensum = 0;
        for(int num:nums)
        {
            if(num % 2 == 0)
             evensum+= num;
        }

        for(int i=0 ;i<size ; i++)
        {
            int val= queries[i][0];
            int idx =queries[i][1];

            if(nums[idx] % 2 == 0)
             evensum-=nums[idx];

             nums[idx]+=val;

            if(nums[idx] % 2 == 0)
             evensum+=nums[idx];

             result[i]=evensum;

        }

        return result;
    }
}