class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        // Step 1: ekane free array ta ready korte hobe (jekhane gaps gulo rakhbo)
        int n = startTime.length;
        int[] freeArray = new int[n + 1];
        freeArray[0] = startTime[0];
        for (int i = 1; i < n; i++) {
            freeArray[i] = startTime[i] - endTime[i - 1];
        }
        freeArray[n] = eventTime - endTime[n - 1];

        int m = freeArray.length;
        int[] maxRightFree = new int[m];
        int[] maxLeftFree = new int[m];

        // Step 2: right sider er max free size 
        for (int i = m - 2; i >= 0; i--) {
            maxRightFree[i] = Math.max(maxRightFree[i + 1], freeArray[i + 1]);
        }
        // Step 3: left side er max free size 
        for (int i = 1; i < m; i++) {
            maxLeftFree[i] = Math.max(maxLeftFree[i - 1], freeArray[i - 1]);
        }

        int result = 0;
        // Step 4: moving on freeArray
        for (int i = 1; i < m; i++) {
            int currEventTime = endTime[i - 1] - startTime[i - 1];

            // Case 1: Move completely out of the space
            if (currEventTime <= Math.max(maxLeftFree[i - 1], maxRightFree[i])) {
                result = Math.max(result, freeArray[i - 1] + currEventTime + freeArray[i]);
            }

            // Case 2: Shift left or right(near move)
            result = Math.max(result, freeArray[i - 1] + freeArray[i]);
        }

        return result;
    }
}