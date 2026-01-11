class Solution {
    public int maxProfit(int[] prices) {
       int profit = 0;
       int minimumPrice = prices[0];
       
       for(int i=1; i<prices.length; i++){
            if(prices[i] < minimumPrice){
                minimumPrice = prices[i];
                continue;
            }

            if((prices[i] - minimumPrice) > profit)
                profit = prices[i] - minimumPrice;
       }

       return profit;
    }
}