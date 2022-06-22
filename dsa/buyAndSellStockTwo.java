public class buyAndSellStockTwo {
    public static void main(String[] args) {
        int[]prices = {7,1,5,3,6,4};
        System.out.println(solution(prices));
    }
    public static int solution(int[]prices){
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
