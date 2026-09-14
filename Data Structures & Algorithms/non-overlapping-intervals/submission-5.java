class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        List<int[]> result = new ArrayList<>();

        int n = intervals.length;
        int i = 1;

        result.add(intervals[0]);
        while(i < n) {
            System.out.println(i);
            int[] i1 = result.get(result.size() - 1);
            if(intervals[i][0] >= i1[1]) {
                result.add(intervals[i]);
            }
            i++;
        }

        return n - result.size();
    }
}
