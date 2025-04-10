//Use Kadane's Algorithm 

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int cheapest = prices[0];
        for(int i = 1; i<prices.length; i++){
            if(prices[i] < cheapest){
                cheapest = prices[i];
            }else if(maxProfit < prices[i]-cheapest){
                maxProfit = prices[i]-cheapest;
            }
        }
        return maxProfit;
    }
}
