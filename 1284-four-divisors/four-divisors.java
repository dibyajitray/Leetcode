class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += getSumIfFourDivisors(num);
        }

        return totalSum;
    }

    private int getSumIfFourDivisors(int n) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {

                count++;
                sum += i;

                if (i * i != n) {
                    count++;
                    sum += n / i;
                }
            }
            
            if (count > 4) return 0;
        }

        return (count == 4) ? sum : 0;
    }
}