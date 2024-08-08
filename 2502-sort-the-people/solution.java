class Solution {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);}

        Arrays.sort(heights);
        String[] result = new String[n];

        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            result[j] = map.get(heights[i]);
        }

        return result;
    }}
