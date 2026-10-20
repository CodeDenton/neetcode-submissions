class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] df = new int[amount+1];
        Arrays.fill(df, amount+1);

        df[0] = 0;
        for(int i=1; i < df.length; i++) {
            for(int coin : coins) {
                if(coin <= i) {
                    df[i] = Math.min(df[i], df[i-coin]+1);
                }
            }
        }
        return df[amount] > amount ? -1 : df[amount];
    }
}
