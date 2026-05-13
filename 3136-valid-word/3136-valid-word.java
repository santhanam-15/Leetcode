class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        boolean vow = false, cons = false;      
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                if(vow && cons) continue ; 
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vow = true;
                } else {
                    cons = true;
                }
            } else if (!Character.isDigit(c)) {
                return false;
            }
        } 
        return vow && cons;       
    }
}
