class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0, sum = 0;
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);
        for(int num : nums){
            sum += num;
            int diff = sum - k;
            res += count.getOrDefault(diff, 0);
            count.put(sum, count.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}