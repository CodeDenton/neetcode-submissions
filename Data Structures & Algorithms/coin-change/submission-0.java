class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] df = new int[amount+1];
        Arrays.fill(df, amount+1); // acts like infinity

        df[0] = 0;
        for(int i=1; i<=amount; i++) {
            for(int c : coins) {
                if(c <= i) {
                    df[i] = Math.min(df[i], df[i-c]+1);
                }
            }
        }
        return df[amount] > amount ? -1 : df[amount];
    }
}
