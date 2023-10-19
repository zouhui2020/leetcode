import java.util.HashMap;
import java.util.Map;

public class 同积数组 {
    public static void main(String[] args) {
        int num[] ={2,3,4,6};
        System.out.println(tupleSameProduct(num));

    }
    public static int tupleSameProduct(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> multi = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                multi.put(nums[i]*nums[j],multi.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : multi.entrySet()) {
            if(entry.getValue()==1) {
                continue;
            }
            else {
                result += (entry.getValue()*(entry.getValue()-1))/2*8;
            }
        }
        return result;
    }
}
