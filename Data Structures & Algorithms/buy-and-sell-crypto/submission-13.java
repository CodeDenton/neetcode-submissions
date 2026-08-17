class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxP = 0;
        while(right < prices.length) { 
            int sum = prices[right] - prices[left];
            if(sum > 0) {
                maxP = Math.max(sum, maxP);
            } else {
                left = right;
            }
            right++;
        }
        return maxP;
    }
}
