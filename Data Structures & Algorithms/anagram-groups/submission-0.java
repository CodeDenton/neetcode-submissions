class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> keyMap = new HashMap<>();

        for(String s : strs) {
            char[] charS = s.toCharArray();
            Arrays.sort(charS);
            String sortedS = new String(charS);
            keyMap.putIfAbsent(sortedS, new ArrayList<>());
            keyMap.get(sortedS).add(s);
        }
        return new ArrayList<>(keyMap.values());
    }
}
