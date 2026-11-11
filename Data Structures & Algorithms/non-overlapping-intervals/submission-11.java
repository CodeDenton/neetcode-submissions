class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int remove = 0;
        List<int[]> intervalsList = new ArrayList<>();

        intervalsList.add(intervals[0]);

        for(int i=1; i<intervals.length; i++) {
            int[] i1 = intervalsList.get(intervalsList.size()-1);
            int[] i2 = intervals[i];

            if(i1[1] > i2[0]) {
                remove++;
            } else {
                intervalsList.add(i2);
            }
        }
        return remove;
    }
}
