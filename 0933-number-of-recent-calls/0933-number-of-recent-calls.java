class RecentCounter {
    List<Integer> counter=new LinkedList<>();
    public RecentCounter() {
    }
    
    public int ping(int t) {
        if(counter.isEmpty()){
            counter.add(t);
            return 1;
        }
        counter.add(t);
        int l= t-3000;
        while(counter.get(0)<l){
            counter.remove(0);
        }
        return counter.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */