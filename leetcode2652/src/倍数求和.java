public class 倍数求和 {

    public static void main(String[] args) {
        System.out.println(sumOfMultiples(7));
    }

    public static int sumOfMultiples(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                res += i;
            }
        }
        return res;
    }
}
