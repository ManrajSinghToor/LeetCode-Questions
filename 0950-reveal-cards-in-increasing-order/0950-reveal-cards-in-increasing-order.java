class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] ans = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();

        Arrays.sort(deck);
        for(int i = 0; i < deck.length; i++){
            q.add(i);
        }
        int i = 0;
        int n = q.size();
        while(n > 1){
            ans[q.remove()] = deck[i++];
            q.add(q.remove());
            n--;
        }
        ans[q.remove()] = deck[i++];
        return ans;
    }
}