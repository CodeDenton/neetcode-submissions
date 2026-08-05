class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> keyMap = new HashMap<>();
        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            keyMap.putIfAbsent(sortedS, new ArrayList<>());
            keyMap.get(sortedS).add(s);
        }
        return new ArrayList<>(keyMap.values());
    }
}
