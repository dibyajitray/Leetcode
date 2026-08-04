import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[] present = new boolean[101];
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int num : nums) {
            present[num] = true;
            if (num < minVal) {
                minVal = num;
            }
            if (num > maxVal) {
                maxVal = num;
            }
        }

        List<Integer> missing = new ArrayList<>();
        for (int i = minVal + 1; i < maxVal; i++) {
            if (!present[i]) {
                missing.add(i);
            }
        }

        return missing;
    }
}