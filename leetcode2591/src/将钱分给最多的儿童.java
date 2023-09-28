public class 将钱分给最多的儿童 {
    public static void main(String[] args) {
        System.out.println(distMoney(13, 3));
//        System.out.println(20/8);
    }

    public static int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        } else if (money == children) {
            return 0;
        } else {
            int max = money / 8;
            for (int i = max; i > 0; i--, max--) {
                int remain_money = money - max * 8;
                if (children < max) {
                    continue;
                } else if (children == max) {
                    if(remain_money==0){
                        return max;
                    }else {
                        continue;
                    }
                }else if (remain_money==4&&(children-max)==1){
                    continue;
                }
                else {
                    if (remain_money < (children - max)) {
                        continue;
                    } else if (remain_money == (children - max)) {
                        break;
                    } else
                        break;
                }

            }
            return max;
        }
    }
}
