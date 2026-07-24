class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int rs[] = new int[n];
        //Step 1 Prefix Product 
        rs[0] = 1;
        for (int i = 1; i < n; i++) {
            rs[i] = rs[i - 1] * nums[i - 1];
        }
        //Step 2 Suffix Product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            rs[i] *= suffix;
            suffix *= nums[i];
        }
        return rs;
    }
}