/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0, high = n;
        return bs(low, high);
    }
    public int bs(int low, int high) {
        // if (low > high) return -1;

        int mid = low + (high - low) / 2;
        int num = guess(mid);
        if (num == 0) return mid;
        else if (num == -1) return bs(low, mid - 1);
        else return bs(mid + 1, high);
    }
}