class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder sb = new StringBuilder();

        for (String str: strs) {
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> solution = new ArrayList<String>();
        
        for (int i=0;i<str.length();) {
            Integer j = str.indexOf('#',i);
            // System.out.printf("Integer j is %d",j);
            Integer tempLen = Integer.parseInt(str.substring(i, j));
            // System.out.printf("length is %d",tempLen);
            i = j + 1;
            solution.add(str.substring(i, i+tempLen));
        
            i += tempLen;
        }
        return solution;
    }
    
    // public static void main(String[] args) {
    //     Solution solution  = new Solution();
    //     ArrayList<String> input = new ArrayList<String>();
    //     input.add("Hello");
    //     input.add("World");
    //     String encodedString = solution.encode(input);
    //     System.out.println(encodedString);
    //     List<String> decodedStrings = solution.decode(encodedString);

    //     for (String str: decodedStrings) {
    //         System.out.println(str);
    //     }
    // }

}