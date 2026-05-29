class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n==0) return 0;

        int leftMax = 0; int start = 0;
        int rightMax = 0; int end = n-1;
        int water = 0;

        while(start<end){
            leftMax = Math.max(leftMax, height[start]);
            rightMax = Math.max(rightMax, height[end]);
            if(leftMax<rightMax){
                water = water + leftMax - height[start];
                start++;
            }
            else{
                water = water + rightMax - height[end];
                end--;
            }
        }
        
        return water;
    }
}