class Solution {
    public void bfs(int node, List<List<Integer>> rooms, boolean[] visit) {
        int n = rooms.size(); 
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visit[node] = true;
        while(!q.isEmpty()) {
            int curr = q.remove();
            int m = rooms.get(curr).size();
            for(int j = 0; j < m; j++) {
                int ele = rooms.get(curr).get(j);
                if(!visit[ele]) {
                    visit[ele] = true;
                    q.add(ele);
                }
            }
        }    
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visit = new boolean[n];
        bfs(0, rooms, visit);
        for(int i = 0; i < visit.length; i++) {
            if(!visit[i]) return false;
        }
        return true;
    }
}