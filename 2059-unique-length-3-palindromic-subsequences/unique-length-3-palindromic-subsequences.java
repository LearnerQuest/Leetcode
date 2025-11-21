class Solution {
    public int countPalindromicSubsequence(String s) {
        int result = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (first != -1 && first < last) {
                Set<Character> middleChars = new HashSet<>();
                for (int i = first + 1; i < last; i++) {
                    middleChars.add(s.charAt(i));
                }
                result += middleChars.size();
            }
        }
        
        return result;
    }

        
}

