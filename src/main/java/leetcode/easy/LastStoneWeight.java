package leetcode.easy;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @see <a href='https://leetcode.com/problems/last-stone-weight/'>1046. Last Stone Weight</a>
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(stones.length, Collections.reverseOrder());

        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() >= 2) {
            int heaviest = pq.poll(); // x: heaviest
            int secondHeaviest = pq.poll(); // y: secondHeaviest
            if (heaviest != secondHeaviest) {
                pq.offer(heaviest - secondHeaviest); // If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
            }
            // If x == y, both stones are destroyed
        }

        return (pq.size() == 0) ? 0 : pq.poll();
    }
}