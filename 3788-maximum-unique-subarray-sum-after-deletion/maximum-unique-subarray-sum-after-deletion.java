class Solution {
    public int maxSum(int[] nums) {

        int sum = 0;
        int neg = Integer.MIN_VALUE;

        Set<Integer> st = new HashSet<>();

        for(int num : nums)
        {
            if(num <= 0)
             neg=Math.max(neg,num);

            else if(!st.contains(num))
            {
                sum+=num;
                st.add(num);
            }
        }

        return sum == 0 ? neg : sum;
        
    }
}