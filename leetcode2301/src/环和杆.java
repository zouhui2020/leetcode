import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class 环和杆 {
    public static void main(String[] args) {
//        String rings = "abcd";
//        每一个分割
//        String[] array=rings.split("(?<=\\G.)");
//        每两个分割
//        String[] array=rings.split("(?<=\\G..)");
        System.out.println(countPoints("B0B6G0R6R0R6G9"));

    }
    public static int countPoints(String rings) {
        int result = 0;
        String[] array=rings.split("(?<=\\G.)");
        HashMap<String, Set<String>> integerSetHashMap = new HashMap<>();
        ArrayList<Set<String>> sets = new ArrayList<>();
//        char[] chars=rings.toCharArray();
        for (int i = 0; i < array.length; i+=2) {
            if(integerSetHashMap.containsKey(array[i+1])) {
                Set<String> strings = integerSetHashMap.get(array[i + 1]);
                strings.add(array[i]);
                integerSetHashMap.put(array[i+1],strings);
            }
            else {
                HashSet<String> strings = new HashSet<>();
                strings.add(array[i]);
                integerSetHashMap.put(array[i+1],strings);
            }
        }
        for (String string : integerSetHashMap.keySet()) {
            if(integerSetHashMap.get(string).size()==3){
                result++;
            }
        }
        return result;
    }
}
