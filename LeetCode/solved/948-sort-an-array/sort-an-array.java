class Solution {
    public int[] sortArray(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        mergeSort(nums, l, r);
        return nums;
    }
    public void mergeSort(int nums[], int l, int r){
        if(l < r){
            int mid = l + (r-l) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            merge(nums, l, mid, r);
        }
    }
    public void merge(int nums[], int l, int mid, int r){
        int i = l;
        int j = mid + 1;
        int k = 0;
        int [] temp = new int[r - l + 1];

        while(i <= mid && j <= r){
            if(nums[i] < nums[j]){
                temp[k] = nums[i];
                i++;
                k++;
            }
            else{
                temp[k] = nums[j];
                j++;
                k++;
            }
        }
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= r){
            temp[k++] = nums[j++];
        }
    for (int idx = 0; idx < temp.length; idx++) {
        nums[l + idx] = temp[idx];
    }
    }
}