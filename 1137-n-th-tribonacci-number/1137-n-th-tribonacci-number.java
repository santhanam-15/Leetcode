class Solution {
    public int tribonacci(int n) {
        int[] arr =new int[n+1];
        if(n<3){
            return n==2 ? 1 : n; 
        }
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        int i=3;
        while(i<=n){
            arr[i]=arr[i-3]+arr[i-2]+arr[i-1];
            i++;
        }
        return arr[n];
    }
}