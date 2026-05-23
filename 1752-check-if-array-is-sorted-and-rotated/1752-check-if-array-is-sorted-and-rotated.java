class Solution {
    public boolean check(int[] nums) {
        boolean falg=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                if(falg) return false;
                falg=true;
            }
        }
    return true;
    }
}