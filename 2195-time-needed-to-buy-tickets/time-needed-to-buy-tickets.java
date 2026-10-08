

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.offer(i);
        }
        int time = 0;
        while (true) {
            int person = q.poll();
            tickets[person]--;
            time++;
            if (person == k && tickets[person] == 0) {
                break;
            }
            if (tickets[person] > 0) {
                q.offer(person);
            }
        }
        return time;
    }
}