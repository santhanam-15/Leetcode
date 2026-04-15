class Solution {
    public int minFlips(int a, int b, int c) {
        int res=0;
        while(a>0 || b>0 || c>0){
            int ca=a&1;
            int cb=b&1;
            int cc=c&1;
            if(cc==0){
                res+=(ca+cb);
            }else{
                if(ca==0 && cb==0){
                    res++;
                }
            }
            a>>=1;
            b>>=1;
            c>>=1;
        }
        return res;
    }
}