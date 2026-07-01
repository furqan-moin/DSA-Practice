class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1 []= s.toCharArray();
        char ch2 [] = t.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            int a= ch1.length; int b = ch2.length;
            if(a!=b) return false;
                for(int i = 0; i<a; i++){
                    if(ch1[i]!=ch2[i])
                    return false;
                
            }
    return true;
    }
}