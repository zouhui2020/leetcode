public class 老人的数目 {
    public static void main(String[] args) {

    }

    public static int countSeniors(String[] details) {
        int count = 0;
        for (String info : details) {
            if (Integer.parseInt(info.substring(11, 13)) > 60) {
                count++;
            }
        }
        return count;
    }
}
