import java.util.Arrays;

public class 购买两块巧克力 {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        money=money<(prices[0]+prices[1])?money:money-(prices[0]+prices[1]);
        return money;
    }
}