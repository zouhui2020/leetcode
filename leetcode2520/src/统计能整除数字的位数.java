public class 统计能整除数字的位数 {
    public static void main(String[] args) {

    }
    public static int countDigits(int num) {
        int t = num;
        int res = 0;
        while (t != 0) {
            if (num % (t % 10) == 0) {
                res++;
            }
            t /= 10;
        }
        return res;
    }
}
