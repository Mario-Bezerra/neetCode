import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]), i + 1};
            }

            map.putIfAbsent(numbers[i], i + 1);
        }

        return new int[0];
}
}