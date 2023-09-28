public class 第2次答案 {
    public static void main(String[] args) {

    }
    public static int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        } else if (money == children) {
            return 0;
        } else {
            money = money - children;//一人分一元
            int max = money/7;//给尽可能多的人再分7元
            if (max>children) {//最大数不应该多于孩子数
                max = children;
            }
            int remain_money = money - max*7;//剩下的钱
            int remain_children = children - max;//剩下没分到8元的孩子（即分到一元的孩子数量）
            if (remain_children==0&&remain_money>0) {//没有剩下孩子，但是剩下钱，把钱全分给一个孩子
                return max-1;
            }
            else if(remain_children==1&&remain_money==3){//剩下一个孩子，而且剩下3元，把钱分给两个孩子
                return max-1;
            }
            else {
                return max;
            }
        }
    }
}
