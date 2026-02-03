class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false; 

        int i = 0;

        int startP1 = i;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == startP1 || i == n - 1) return false; 

        int startP2 = i;
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == startP2 || i == n - 1) return false;

        int startP3 = i;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == startP3) return false;

        return i == n - 1;
    }
}