class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> stringMap = new HashMap<>();
        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            stringMap.putIfAbsent(sortedS, new ArrayList<>());
            stringMap.get(sortedS).add(s);
        }
        return new ArrayList<>(stringMap.values());
    }
}
