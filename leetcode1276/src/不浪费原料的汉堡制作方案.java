import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 不浪费原料的汉堡制作方案 {
    List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if(cheeseSlices*2>tomatoSlices||tomatoSlices%2!=0||cheeseSlices*4<tomatoSlices)
            return new ArrayList<>();
        int big = 0;
        int small = cheeseSlices;
        for(int i=0;i<(tomatoSlices-cheeseSlices*2)/2;i++){
            big+=1;
            small-=1;
        }
        return new ArrayList<Integer>(Arrays.asList(big,small));
    }
}