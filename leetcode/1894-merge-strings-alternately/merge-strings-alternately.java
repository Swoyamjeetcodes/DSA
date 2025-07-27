class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int p1 = 0, n1 = word1.length() - 1, p2 = 0, n2 = word2.length() - 1;
        while(p1 <= n1 && p2 <= n2){
            merged.append(word1.charAt(p1++));
            merged.append(word2.charAt(p2++));
        }
        while(p1 <= n1){
            merged.append(word1.charAt(p1++));
        }
        while(p2 <= n2){
            merged.append(word2.charAt(p2++));
        }
        return merged.toString();
    }

}