class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] bucket = new List[nums.length + 1];
        Map <Integer, Integer> topk = new HashMap<>();
        for(int num : nums){
            topk.put(num, topk.getOrDefault(num, 0)+1);
        }

        for(int key : topk.keySet()){
            int freq = topk.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        List<Integer> res = new ArrayList<>();

        for(int pos = bucket.length - 1; pos >=0 && res.size() < k; pos--){
            if(bucket[pos] != null){
                res.addAll(bucket[pos]);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}