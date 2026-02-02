
class Solution {
    private TreeMap<Integer, Integer> left = new TreeMap<>();
    private TreeMap<Integer, Integer> right = new TreeMap<>();
    private int leftCount = 0;
    private long leftSum = 0;

    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        int target = k - 1;

        for (int i = 1; i <= dist + 1; i++) {
            add(nums[i]);
        }
        
        balance(target);
        long minSum = leftSum;

        for (int i = dist + 2; i < n; i++) {
            remove(nums[i - dist - 1]);
            add(nums[i]);
            balance(target);
            minSum = Math.min(minSum, leftSum);
        }

        return (long) nums[0] + minSum;
    }

    private void add(int val) {
        left.put(val, left.getOrDefault(val, 0) + 1);
        leftSum += val;
        leftCount++;
    }

    private void remove(int val) {
        if (left.containsKey(val)) {
            left.put(val, left.get(val) - 1);
            if (left.get(val) == 0) left.remove(val);
            leftSum -= val;
            leftCount--;
        } else {
            right.put(val, right.get(val) - 1);
            if (right.get(val) == 0) right.remove(val);
        }
    }

    private void balance(int target) {

        while (leftCount > target) {
            int maxVal = left.lastKey();
            removeFromLeft(maxVal);
            addToRight(maxVal);
        }

        while (leftCount < target && !right.isEmpty()) {
            int minVal = right.firstKey();
            removeFromRight(minVal);
            addToLeft(minVal);
        }

        while (!left.isEmpty() && !right.isEmpty() && left.lastKey() > right.firstKey()) {
            int maxL = left.lastKey();
            int minR = right.firstKey();
            removeFromLeft(maxL);
            removeFromRight(minR);
            addToLeft(minR);
            addToRight(maxL);
        }
    }

    private void addToLeft(int val) {
        left.put(val, left.getOrDefault(val, 0) + 1);
        leftSum += val;
        leftCount++;
    }

    private void removeFromLeft(int val) {
        left.put(val, left.get(val) - 1);
        if (left.get(val) == 0) left.remove(val);
        leftSum -= val;
        leftCount--;
    }

    private void addToRight(int val) {
        right.put(val, right.getOrDefault(val, 0) + 1);
    }

    private void removeFromRight(int val) {
        right.put(val, right.get(val) - 1);
        if (right.get(val) == 0) right.remove(val);
    }
}