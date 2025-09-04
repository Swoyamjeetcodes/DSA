class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        return bs(nums, target, low, high);
    }
    public int bs(int[] nums, int target, int low, int high) {
        if (low > high) return low + (high - low) / 2;

        int mid = low + (high - low) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) return bs(nums, target, low, mid - 1);
        else return bs(nums, target, mid + 1, high);
    }
}