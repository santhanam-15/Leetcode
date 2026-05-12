class Solution {
    public int[] separateDigits(int[] nums) {
        int countdigit=0;
        for(int num:nums){
            int temp=num;
            while(temp>0){
                countdigit++;
                temp/=10;
            }
        }
        int [] ans=new int[countdigit];
        int index=0,top=-1;
        int[] stack=new int[6];
        for(int num:nums){
            int temp=num;
            while(temp>0){
                stack[++top]=temp%10;
                temp/=10;
            }
            while(top>=0){
                ans[index++]=stack[top--];
            }
        }
        return ans;
    }
}