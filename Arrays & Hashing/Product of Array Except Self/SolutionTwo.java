class SolutionTwo {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int productBeforeI[] = new int[n];
        int productAfterI[] = new int[n];
        productBeforeI[0] = 1;
        productAfterI[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            productBeforeI[i] = productBeforeI[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            productAfterI[i] = productAfterI[i + 1] * nums[i + 1];
        }

        int result[] = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = productBeforeI[i] * productAfterI[i];
        }
        return result;
    }
}