class Solution {
    public boolean isGood(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n = Math.max(n, num);
        }
        int[] map=new int[n+1];
        for (int i : nums) {
            map[i]++;
        }
        for(int i=1;i<n;i++){
            if(map[i]==0 || map[i]>1) return false;
        }
        return  map[n] == 2;
    }
}