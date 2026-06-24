class Solution {
    public int passwordStrength(String pass) {
        int res=0;
        boolean[] arr=new boolean[128];
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if(arr[ch]) continue;
            if (ch >= 'a' && ch <= 'z') res+=1;
            else if (ch >= 'A' && ch <= 'Z') res+=2;
            else if (ch >= '0' && ch <= '9') res+=3;
            else if ((ch >= '!' && ch <= '*')|| ch == '@') res+=5;
            arr[ch]=true;
        }
        return res;
    }
}