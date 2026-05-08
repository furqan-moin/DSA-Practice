class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> rs = new HashMap<>();
        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String key  = new String(ch);
            rs.putIfAbsent(key, new ArrayList<>());
            rs.get(key).add(s);
        }
        return new ArrayList<>(rs.values());
    }
}