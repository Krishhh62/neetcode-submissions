class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1;
        int maxi=0;
        while(r<prices.length){
            int maxAmt=prices[r]-prices[l];
            maxi=Math.max(maxAmt,maxi);
            if(prices[r]<prices[l]){
                l=r;
                r++;
            }else{
                r++;
            }
        }
        return maxi;
    }
}
