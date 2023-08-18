package Arrays;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock
// and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
public class BuyAndSellStock {
    public static void main(String[] args) {
//        int[]prices={7,1,5,3,6,4};
        int[]prices={7,6,4,3,1};
        int max=0;
        int i=0;
        for (int j = i+1; j < prices.length; j++) {
            if (prices[i]<prices[j]){
                max=Math.max(max,prices[j]-prices[i]);
            }else {
                i=j;
            }
        }
        System.out.println(max);
    }
}
