class Solution {
    public int searchInsert(int[] nums, int target) {
        return bs(nums, 0, nums.length - 1, target);
    }

    public int bs(int[] nums, int left, int right, int target) {
        if (left > right) {
            return left;
        }

        int mid = (left + right) / 2;

        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            return bs(nums, left, mid - 1, target);
        } else {
            return bs(nums, mid + 1, right, target);
        }
    }
}
