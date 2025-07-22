class Solution {
    public int minAddToMakeValid(String s) {
        int size = 0; //eta opening parentheses '(' er jonno
        int open = 0; // eta unmatched closing parentheses ')' er jonno

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                size++; 
            } else if (size > 0) {
                size--; 
            } else {
                open++; 
            }
        }
        return open + size; 
    }
}