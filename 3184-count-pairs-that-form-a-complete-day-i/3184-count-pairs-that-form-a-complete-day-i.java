class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int l = hours.length;
        int c = 0;
        for(int i = 0; i < l-1; i++ ){
            for(int j = i + 1; j < l; j++){
                if((hours[i] + hours[j]) % 24 == 0) c++;
            }
        }
        return c;
    }
}