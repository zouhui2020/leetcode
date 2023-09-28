public class 递枕头 {
    public static void main(String[] args) {
        System.out.println(passThePillow(5,4));
    }

    public static int passThePillow(int n, int time) {
        time = time + 1;
        int round = 2*n-2;
        int res = time % round;
        if (res > n){
            return 2*n-res;
        }
        else if (res == 0){
            return 2;
        }
        else {
            return res;
        }
    }


}
