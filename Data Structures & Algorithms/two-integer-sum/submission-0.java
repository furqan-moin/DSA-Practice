class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int rs[]=new int[2];
        for(int i = 0; i<n-1;i++){
            for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j]==target){
            rs[0]=i;rs[1]=j;
            return rs;
            }
            }
        }
        return rs;
    }
}
