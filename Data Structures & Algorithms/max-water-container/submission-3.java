class Solution {
    public int maxArea(int[] heights) {
       //(i-j)*heights(i)
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int max = 0;
        while(left<right){
            int width = right-left;
            int length = Math.min(heights[left], heights[right]);
            int area = length * width;
            max = Math.max(max, area);
            if(heights[left]<=heights[right])left++;
            else right --;
        }
        return max;
    }
}