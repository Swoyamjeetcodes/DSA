class Solution {

    public String encode(String s[]) {
        // write your logic to encode the strings
        StringBuilder res = new StringBuilder();
        for(String str : s){
            res.append(str.length()).append('#').append(str);
        }
        return res.toString();
    }

    public String[] decode(String s) {
        // write your logic to decode the string
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            int j = i;
            while(s.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(s.substring(i, j));
            i = j;
        }
        return res.toArray(new String[0]);
    }
}