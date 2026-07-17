public class Profit {
  public static void main(String[] args) {

    }
    static int maxProfit(int []prices){
      int maxProfit =0;
      int minPrice = prices[0];
      for(int i = 0 ;i<prices.length;i++){
          if(prices[i]<minPrice){
              minPrice =prices[i];
          }
          else {
              int profit =prices[i]-minPrice;
              if(profit>maxProfit){
                  maxProfit = profit;
              }
          }
      }
      return maxProfit;
    }
}
