class Solution {
public:
    int reverse(int x) {
        int temp = 0;
        while (x!=0)
        {
            int n = x % 10;

            if (temp > INT_MAX / 10 || (temp == INT_MAX / 10 && n > 7)) 
                {
                    return 0; // Overflow case for positive numbers
                }
            if (temp < INT_MIN / 10 || (temp == INT_MIN / 10 && n < -8)) 
                {
                    return 0; // Overflow case for negative numbers
                }

            temp=temp*10+n;
            x=x/10;
        }
        
        return temp;
    }
};