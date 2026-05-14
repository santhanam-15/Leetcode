class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] vis=new int[rooms.size()];
        dfs(rooms,vis,0);
        for(int i : vis){
            if(i==0){
                return false;
            }
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms,int[] vis,int idx){
        vis[idx]=1;
        for(int i : rooms.get(idx)){
            if(vis[i]==0){
                dfs(rooms,vis,i);
            }
        }
    }
}