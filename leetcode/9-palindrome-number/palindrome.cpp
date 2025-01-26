class Solution {
public:
    bool isPalindrome(int x) {
         if (x < 0) 
        {
            return false;
        }
        int temp = x;
        int reverse=0;
        while(temp!=0)
            {
                int n = temp % 10;
                if (reverse > (INT_MAX / 10) || (reverse == INT_MAX / 10 && n > 7)) {
                return false; // Overflow case
            }
                reverse = reverse * 10 + n;
                temp = temp/10;
            }
            if(reverse==x)
            {
                return 1;
            }
            else
            return 0;
    }
};
