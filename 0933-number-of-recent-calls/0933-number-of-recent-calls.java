class RecentCounter {
    Deque<Integer> counter = new ArrayDeque<>();
    public RecentCounter() {
    }
    
    public int ping(int t) {
        if(counter.isEmpty()){
            counter.addLast(t);
            return 1;
        }
        counter.add(t);
        int l= t-3000;
        while(counter.getFirst()<l){
            counter.removeFirst();
        }
        return counter.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */