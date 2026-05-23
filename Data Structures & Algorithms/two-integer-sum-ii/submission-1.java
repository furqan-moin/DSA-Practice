class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int rs[] = new int[2];
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                rs[0] = l + 1;
                rs[1] = r + 1;
                return rs;
            } else {
                if (sum < target)
                    l++;
                if (sum > target)
                    r--;
            }
        }
        return rs;
    }
}