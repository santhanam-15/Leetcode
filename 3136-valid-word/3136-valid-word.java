class Solution {
    public boolean isValid(String word) {       
        if(word.length() < 3) return false;
        boolean vow = false, cons = false;
        for(char c : word.toCharArray()) {
            switch(c) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    vow = true;
                    break;
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 
                     'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
                     'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 
                     'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z':
                    cons = true;
                    break;
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    break;
                default:
                    return false;
            }
        }
        return vow && cons ;
    }
}