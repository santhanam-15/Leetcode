class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int n : nums){
            String s = String.valueOf(n);
            for(char c : s.toCharArray()){
                arr.add(c - '0');
            }
        }
        int[] res = new int[arr.size()];
        int i = 0;
        for(int n : arr){
            res[i++] = n;
        }
        return res;
    }
}