class Solution {
    public String minWindow(String s, String t) {
         if (t.length() > s.length())
            return "";

        Map<Character, Integer> need = new HashMap<>();

        //To get the frequency of each charcater in t
        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int left = 0, have = 0, required = need.size();
        Map<Character, Integer> window = new HashMap<>();
        int minLen = Integer.MAX_VALUE, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            if (need.containsKey(ch) && window.get(ch).intValue() == need.get(ch).intValue()) {
                have++;
            }
            // Valid window found
            while (have == required) {
                // Update minimum
                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Remove left char
                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) &&
                        window.get(leftChar) < need.get(leftChar)) {
                    have--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}
