class Solution {
    public int maxVowels(String s, int k) {
        int max=0,j=0,v=0;
        for(int i=0;i<s.length();i++){
            if(isvow(s.charAt(i))) v++;
            if((i-j+1) == k){
                max=Math.max(max,v);
                if(max==k) break;
                if(isvow(s.charAt(j))) v--;
                j++;
            }
        }
        return max;
    }
    private boolean isvow(char c){
        return "aeiou".indexOf(c)!=-1;
    }
}