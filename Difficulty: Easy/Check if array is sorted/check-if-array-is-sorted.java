class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        for(int i = 0; i < arr.length; i++)
        {
            int min = arr[i];
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < min)
                return false;
            }
        }
        return true;
    }
}