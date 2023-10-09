import java.util.*;
import java.util.stream.Collectors;

public class 最小和分割 {
    public static void main(String[] args) {
        System.out.println(splitNum(4325));
    }
    public static int splitNum(int num) {
        List numList = new ArrayList<Integer>();
        int num1 = 0;
        int num2 = 0;
        while (num > 0) {
           int temp = num % 10;
           numList.add(temp);
           num /= 10;
        }


        Collections.sort(numList);

//        numList.sort(new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });

//        System.out.println(numList.stream().sorted().collect(Collectors.toList()));
        System.out.println(numList);
        for (int i = 0; i < numList.size(); i++){
            if(i%2==0){
                num1 = num1*10 + (Integer) numList.get(i);
            }
            else {
                num2 = num2*10 + (Integer) numList.get(i);
            }
        }
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        return num1+num2;
    }
    //冒泡
//        int[] a ={1,7,4,3,6,8};
//        for(int i=0; i<a.length; i++){
//            for (int j=i+1; j<a.length; j++){
//                if(a[j-1]>a[j]){
//                    int temp = a[j-1];
//                    a[j-1] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
}
