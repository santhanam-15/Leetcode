import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isGood(int[] nums) {

        int n = 0;
        for (int num : nums) {
            n = Math.max(n, num);
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i < n; i++) {
            if (freq.getOrDefault(i, 0) != 1) {
                return false;
            }
        }
        return freq.getOrDefault(n, 0) == 2;
    }
}