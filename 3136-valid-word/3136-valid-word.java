class Solution {
    public boolean isValid(String word) {
        int vow = 0, cons = 0;
        if(word.length() < 3) return false;
        for(char c: word.toCharArray()){
            if(Character.isLetter(c)){
                if("AEIOUaeiou".indexOf(c) != -1) vow++;
                else cons++;
            }
            else if(!Character.isDigit(c)) return false;
        } 
        return vow >= 1 && cons >= 1;       
    }
}