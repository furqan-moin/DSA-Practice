class Solution {
    public int[] topKFrequent(int[] nums, int k) {
 HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // compares the values and order it in dsec order (max heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());    //pass

        int count = 0;
        int res[] = new int[k];
        while(!pq.isEmpty() && count < k){
            int curr = pq.poll();
            res[count++] = curr;
        }

        return res;
    }
}
