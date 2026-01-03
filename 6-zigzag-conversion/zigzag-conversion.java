class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        int step = 1;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);


            if (currentRow == numRows - 1) {
                step = -1;
            } 

            else if (currentRow == 0) {
                step = 1;
            }

            currentRow += step;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}