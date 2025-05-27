class Solution {

    static int search(int arr[], int x) {
    
        // Your code here
        int n = arr.length;
        for(int i = 0;i < n; i++){
            if(arr[i] == x)
            return i;
        }
        return -1;
    }
}
