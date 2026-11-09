class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int p : piles) {
            right = Math.max(right, p);
        }

        return binarySerach(piles, left, right, h);
    }

    public int binarySerach(int[] piles, int left, int right, int h) {
        while(left < right) {
            int hours = 0;

            int mid = left + (right-left) / 2;

            for(int p : piles) {
                hours += (p + mid - 1) / mid;
            }

            if(hours <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
