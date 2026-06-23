class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<>();

        while (!visit.contains(n)) {
            visit.add(n);
            n = getSqrSum(n);
            if (n == 1)
                return true;
        }
        return false;
    }

    public static int getSqrSum(int n) {
        int output = 0;
        while (n > 0) {
            int digit = n % 10;
            output = output + digit * digit;
            n = n / 10;
        }
        return output;
    }
}