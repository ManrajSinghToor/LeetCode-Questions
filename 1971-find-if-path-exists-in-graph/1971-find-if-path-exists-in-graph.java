class Solution {
    public boolean bfs(int source, int destination, boolean[] visit, List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visit[source] = true;
        while(!q.isEmpty()) {
            int top = q.remove();
            if(top == destination) return true;
            int m = adj.get(top).size();
            for(int i = 0; i < m; i++) {
                int ele = adj.get(top).get(i);
                if(!visit[ele]) {
                    q.add(ele);
                    visit[ele] = true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++) {
            int ver = edges[i][0];
            int edg = edges[i][1];

            adj.get(ver).add(edg);
            adj.get(edg).add(ver);
        }
        int size = adj.size();
        boolean[] visit = new boolean[size];
        return bfs(source, destination, visit, adj);
    }
}