class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length,l=1,r=n-2;
        while(l<=r){
            if(nums[l-1]<nums[l] && nums[l]>nums[l+1]){
                return l;
            }
            else if(nums[r-1]<nums[r] && nums[r]>nums[r+1]){
                return r;
            }
            l++;
            r--;
        }
        return nums[0]>nums[n-1] ? 0:n-1;
    }
}