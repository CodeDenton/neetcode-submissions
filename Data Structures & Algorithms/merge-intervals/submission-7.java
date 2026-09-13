class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for(int i=1; i<intervals.length; i++) {

            int[] i1 = result.get(result.size() - 1);
            int[] i2 = intervals[i];
            System.out.println(Arrays.toString(i1));
            if(i1[1] >= i2[0]) {
                i1[1] = i2[1] > i1[1] ? i2[1] : i1[1];
            } else {
                result.add(i2);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
