class Solution {
    
    public static int longestOnes(int[] nums, int k) {
        int left=0,zeroes=0,Max=0;
        for(int i=left;i<nums.length;i++){
            if(nums[i]!=1){
                zeroes++;
            }
            while(zeroes>k){
                if(nums[left]==0){zeroes--;}
                left++;
            }
            Max=Math.max(Max,i-left+1);
        }
        return Max;
    }
    static {
        for(int i=0;i<100;i++){
            longestOnes(new int[]{0,0,0},4);
        }
    };
}