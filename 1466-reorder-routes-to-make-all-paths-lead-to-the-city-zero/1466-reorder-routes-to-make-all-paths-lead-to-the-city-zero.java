class Solution {
    List<int[]>[] adj;
    public int minReorder(int n, int[][] conn) {
        adj = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for(int[] e : conn) {
            int u = e[0];
            int v = e[1];
            adj[u].add(new int[]{v, 1});
            adj[v].add(new int[]{u, 0});
        }
        boolean[] vis = new boolean[n];
        return dfs(0, vis);
    }

    private int dfs(int node, boolean[] vis) {
        vis[node] = true;
        int changes = 0;
        for(int[] nei : adj[node]) {
            int next = nei[0];
            int cost = nei[1];
            if(!vis[next]) {
                changes += cost;
                changes += dfs(next, vis);
            }
        }
        return changes;
    }
}