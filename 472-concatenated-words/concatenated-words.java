class Solution {
    public boolean isConcatenated(String word, Set<String> st, Map<String, Boolean> memo) {
        if (memo.containsKey(word)) {
            return memo.get(word);
        }

        int len = word.length();
        for (int i = 1; i < len; i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);

            if (st.contains(prefix) && (st.contains(suffix) || isConcatenated(suffix, st, memo))) {
                memo.put(word, true);
                return true;
            }
        }

        memo.put(word, false);
        return false;
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> st = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        Map<String, Boolean> memo = new HashMap<>();

        for (String word : words) {
            st.remove(word);
            if (isConcatenated(word, st, memo)) {
                result.add(word);
            }
            st.add(word);
        }

        return result;
    }
}
