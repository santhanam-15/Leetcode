class Solution {
    public int search(int[] nums, int t) {
        int s=0,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==t){
                return mid;
            }
            if(nums[s]<=nums[mid]){
                if(nums[s]<=t && nums[mid]>t){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                if(nums[mid]<t && nums[e]>=t){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return -1;
    }
}