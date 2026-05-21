class SmallestInfiniteSet {
    TreeSet<Integer> s = new TreeSet<>();
    int val=1;
    public SmallestInfiniteSet() {
        
    }
    
    public int popSmallest() {
        if(!s.isEmpty()){
            return s.pollFirst();
        }
        int r=val;
        val++;
        return r;
    }
    
    public void addBack(int num) {
        if(num<val){
            s.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */