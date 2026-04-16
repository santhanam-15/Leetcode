class Solution {
    public void reverseString(char[] s) {
        int i=0,n=s.length;
        while(i<n/2){
            char t=s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=t;
            i++;
        }
    }
}