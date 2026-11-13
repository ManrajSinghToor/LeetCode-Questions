class Solution {
    public boolean bfs(int node, int[] visit, int[][] graph) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visit[node] = -1;
        while(!q.isEmpty()) {
            int currNode = q.remove();
            for(int i = 0; i < graph[currNode].length; i++) {
                int ele = graph[currNode][i];
                if(visit[ele] == 0 && visit[currNode] == -1) {
                    q.add(ele);
                    visit[ele] = -2;
                }
                else if(visit[ele] == 0 && visit[currNode] == -2) {
                    q.add(ele);
                    visit[ele] = -1;
                } 
                else {
                    if(visit[ele] == visit[currNode]) return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int m = graph[0].length;
        int[] visit = new int[n];
        for(int i = 0; i < n; i++) {
            if(visit[i] == 0 && !(bfs(i, visit, graph))) {
                return false;
            }
        }
        return true;
    }
}