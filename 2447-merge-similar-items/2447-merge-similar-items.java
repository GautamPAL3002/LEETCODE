class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        // Use TreeMap to automatically sort by value
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Process items1
        for (int[] item : items1) {
            int value = item[0];
            int weight = item[1];
            map.put(value, map.getOrDefault(value, 0) + weight);
        }

        // Process items2
        for (int[] item : items2) {
            int value = item[0];
            int weight = item[1];
            map.put(value, map.getOrDefault(value, 0) + weight);
        }

        // Build the result
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        return result;
    }
}
