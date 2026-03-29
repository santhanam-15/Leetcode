class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,c=0;
        while(i<j){
            int s=nums[i]+nums[j];
            if(s==k){
                c++;
                i++;
                j--;
            }else if(s<k) i++;
            else j--;
        }
        return c;
    }
}