class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,i=0,j=0,z=0;
        while(i<nums.length){
            if(nums[i]==0){
                z++;
            }
            while(z>1){
                if(nums[j]==0) z--;
                j++;
            }
            max=Math.max(max,i-j);
            i++;
        }
        return max;
    }
}