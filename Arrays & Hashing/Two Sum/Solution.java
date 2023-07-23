import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length ; i++) {
            Integer diference = target - nums[i];
            if(map.containsKey(diference)) {
                return new int[] {i, map.get(diference)};
            }

            else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}
