import java.util.Arrays;


class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int sequence = 1;
        int biggestSequence = 1;

        if(nums.length == 0){
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] - nums[i - 1] == 1) {
                sequence++;
                if(sequence > biggestSequence) biggestSequence = sequence;
            } else {
                sequence = 1 ;
            }
        }

        return biggestSequence;
    }
}
