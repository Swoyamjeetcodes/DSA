class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int one = 0, two = n - 1;
        while(one < two){
            char temp = s[one];
            s[one++] = s[two];
            s[two--] = temp;
        }
    }
}