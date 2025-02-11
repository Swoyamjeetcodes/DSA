class Solution {
    public boolean isPalindrome(String s) {
        // Convert string to lowercase for case-insensitive comparison
        s = s.toLowerCase();

        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    // Recursive helper function to check if the substring is a palindrome
    private boolean isPalindromeHelper(String s, int left, int right) {
        // Base case: If pointers cross, the string is a palindrome
        if (left >= right) {
            return true;
        }

        // Skip non-alphanumeric characters from the left
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }

        // Skip non-alphanumeric characters from the right
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }

        // Compare characters at left and right pointers
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }

        // Recur for the next characters
        return isPalindromeHelper(s, left + 1, right - 1);
    }
};