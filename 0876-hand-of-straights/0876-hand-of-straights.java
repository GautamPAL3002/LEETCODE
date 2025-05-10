public class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        // Step 1: Use TreeMap to store frequencies in sorted order
        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (int card : hand) {
            count.put(card, count.getOrDefault(card, 0) + 1);
        }

        // Step 2: Iterate through sorted keys (like pointer)
        for (int key : count.keySet()) {
            int freq = count.get(key);
            if (freq > 0) {
                // Try to form a group starting from current key
                for (int i = 0; i < groupSize; i++) {
                    int nextCard = key + i;
                    if (count.getOrDefault(nextCard, 0) < freq) {
                        return false;
                    }
                    count.put(nextCard, count.get(nextCard) - freq);
                }
            }
        }

        return true;
    }
}
