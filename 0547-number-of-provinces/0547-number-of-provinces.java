class Solution {
    public void bfs(int node, int[][] isConnected, boolean[] visit) {
        int n = isConnected.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visit[node] = true;
        while(!q.isEmpty()) {
            int curr = q.remove();
            for(int j = 0; j < n; j++) {
                if(isConnected[curr][j] == 1 && !visit[j]) {
                    visit[j] = true;
                    q.add(j);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visit = new boolean[n];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(!visit[i]) {
                bfs(i, isConnected, visit);
                cnt++;
            }
        }
        return cnt;
    }
}