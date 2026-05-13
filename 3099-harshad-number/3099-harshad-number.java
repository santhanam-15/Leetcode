class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=0,temp=x;
        while(temp>0){
            n+=temp%10;
            temp/=10;
        }
        return x%n==0 ? n : -1 ;
    }
}