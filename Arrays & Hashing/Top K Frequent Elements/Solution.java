import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> mappingSolution = new HashMap();

        if (nums.length == 1){
            return new int[] {nums[0]};
        }

        int j = nums.length - 1;
        for (int i = 0 ; i <= j ; i++){

            if (mappingSolution.containsKey(nums[i])){
                mappingSolution.put(nums[i], mappingSolution.get(nums[i]).intValue() + 1);
            } else {
                mappingSolution.put(nums[i], 1);
            }

            if (mappingSolution.containsKey(nums[j])){
                mappingSolution.put(nums[j], mappingSolution.get(nums[j]).intValue() + 1);
            } else {
                mappingSolution.put(nums[j], 1);
            }
            j--;
        }

        return getMaximumValues(mappingSolution, k);
    }

    private int[] getMaximumValues(HashMap<Integer, Integer> mappingSolution, int frequency) {
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())
        );

        for (Map.Entry<Integer, Integer> entry : mappingSolution.entrySet()) {
            maxHeap.offer(entry);
        }

        List<Integer> kLargestKeys = new ArrayList<>();
        for (int i = 0; i < frequency && !maxHeap.isEmpty(); i++) {
            kLargestKeys.add(maxHeap.poll().getKey());
        }

        return kLargestKeys.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}