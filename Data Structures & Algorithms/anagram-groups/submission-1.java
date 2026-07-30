class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> myMap = new HashMap<>();

        for(String s : strs) {
            char[] cArray = s.toCharArray();
            Arrays.sort(cArray);
            String sortedS = new String(cArray);
            myMap.putIfAbsent(sortedS, new ArrayList<String>());
            myMap.get(sortedS).add(s);
        }

        return new ArrayList<>(myMap.values());
    }
}
