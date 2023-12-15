class Solution {
    public int[] twoSum(int[] numbers, int target) {
    
        int low = 0;
        int high = numbers.length - 1;

        if(numbers.length == 2){
            return new int[] {1,2};
        }

        for(int i = low ; low <= high ;){
            
            if(numbers[low] + numbers[high] > target){
                high--;
            }
            
            if(numbers[low] + numbers[high] < target){
                low++;
            }

            if(numbers[low] + numbers[high] == target){
                return new int[] {low + 1 , high + 1};
            }
            
        }

        return new int[] {0,0};
    }
}