class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            int diff = target - num;
            if(prevMap.containsKey(diff)){
                return new int[]{prevMap.get(diff), i + 1};
            }
            prevMap.put(num, i + 1);
        }
        return new int[]{};
    }
}