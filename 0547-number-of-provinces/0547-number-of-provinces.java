class Solution {
    public int findCircleNum(int[][] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(graph, vis, i);
                s++;
            }
        }
        return s;
    }
    public void dfs(int[][] graph,boolean[] vis, int idx) {
        vis[idx] = true;
        for (int i = 0; i < graph[idx].length; i++) {
            if (graph[idx][i] == 1 && !vis[i]) {
                dfs(graph, vis, i);
            }
        }
    }
}