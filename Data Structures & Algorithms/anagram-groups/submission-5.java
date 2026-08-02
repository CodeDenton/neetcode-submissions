class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> myStrings = new HashMap<>();
        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            myStrings.putIfAbsent(sortedS, new ArrayList<>());
            myStrings.get(sortedS).add(s);
        }

        return new ArrayList<>(myStrings.values());
    }
}
