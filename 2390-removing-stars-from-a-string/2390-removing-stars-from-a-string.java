class Solution {
    public String removeStars(String s) {
        StringBuilder res=new StringBuilder();
        int l=0;
        for(char c : s.toCharArray()){
            if(l!=0 && c=='*'){
                res.deleteCharAt(l-1);
                --l;
                continue;
            }
            res.append(c);
            l++;
        }
        return res.toString();
    }
}