public class 股票的价格波动 {

    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();
        stockPrice.update(1, 10); // 时间戳为 [1] ，对应的股票价格为 [10] 。
        stockPrice.update(2, 5);  // 时间戳为 [1,2] ，对应的股票价格为 [10,5] 。
        stockPrice.current();     // 返回 5 ，最新时间戳为 2 ，对应价格为 5 。
        stockPrice.maximum();     // 返回 10 ，最高价格的时间戳为 1 ，价格为 10 。
        stockPrice.update(1, 3);  // 之前时间戳为 1 的价格错误，价格更新为 3 。
        // 时间戳为 [1,2] ，对应股票价格为 [3,5] 。
        stockPrice.maximum();     // 返回 5 ，更正后最高价格为 5 。
        stockPrice.update(4, 2);  // 时间戳为 [1,2,4] ，对应价格为 [3,5,2] 。
        stockPrice.minimum();     // 返回 2 ，最低价格时间戳为 4 ，价格为 2 。
    }


     static class StockPrice {
        int maxTimestamp;//存储最大时间戳
        HashMap<Integer, Integer> timePriceMap; //哈希表存储时间戳（不重复）和最新价格
        TreeMap<Integer, Integer> prices;//有序表存储价格，对价格排序

        public StockPrice() {
            maxTimestamp = 0;
            timePriceMap = new HashMap<Integer, Integer>();
            prices = new TreeMap<Integer, Integer>();
        }

        public void update(int timestamp, int price) {
            maxTimestamp = Math.max(maxTimestamp, timestamp);
            int prevPrice = timePriceMap.getOrDefault(timestamp, 0);
            timePriceMap.put(timestamp, price);
            if (prevPrice > 0) {
                prices.put(prevPrice, prices.get(prevPrice) - 1);
                if (prices.get(prevPrice) == 0) {
                    prices.remove(prevPrice);
                }
            }
            prices.put(price, prices.getOrDefault(price, 0) + 1);
        }

        public int current() {
            return timePriceMap.get(maxTimestamp);
        }

        public int maximum() {
            return prices.lastKey();
        }

        public int minimum() {
            return prices.firstKey();
        }
    }
}




