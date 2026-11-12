class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> prevMap = new HashMap<>();

        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            prevMap.putIfAbsent(sortedS, new ArrayList<>());
            prevMap.get(sortedS).add(s);
        }

        return new ArrayList<>(prevMap.values());
    }
}
