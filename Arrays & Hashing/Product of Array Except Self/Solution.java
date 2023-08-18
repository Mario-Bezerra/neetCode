import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] solution = new int[nums.length];
        ArrayList<Integer> copyList = Arrays.stream(nums)
                                            .parallel()
                                            .boxed()
                                            .collect(Collectors.toCollection(ArrayList::new));

        for (int i = 0 ; i < nums.length ; i++){
            ArrayList<Integer> actualLoopArray = (ArrayList<Integer>) copyList.clone();
            actualLoopArray.remove(i);
            solution[i] = actualLoopArray.stream().parallel().reduce(1, (x, y) -> x * y);
        }

        return solution;
    }
}