import java.util.Arrays;

public class 切割后面积最大的蛋糕 {
    public static void main(String[] args) {
        int[] horizontalCuts = {2};
        int[] verticalCuts = {2};
        System.out.println(maxArea(1000000000, 1000000000, horizontalCuts, verticalCuts));
    }
    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int hmax = horizontalCuts[0];
        int vmax = verticalCuts[0];
        for (int i = 0; i < horizontalCuts.length-1; i++) {
            if (hmax < Math.abs(horizontalCuts[i] - horizontalCuts[i+1]))
                hmax = Math.abs(horizontalCuts[i] - horizontalCuts[i+1]);
        }
        if (hmax < Math.abs(h - horizontalCuts[horizontalCuts.length-1]))
            hmax = Math.abs(h - horizontalCuts[horizontalCuts.length-1]);

        for (int i = 0; i < verticalCuts.length-1; i++) {
            if (vmax < Math.abs(verticalCuts[i] - verticalCuts[i+1]))
                vmax = Math.abs(verticalCuts[i] - verticalCuts[i+1]);
        }
        if (vmax < Math.abs(w - verticalCuts[verticalCuts.length-1]))
            vmax = Math.abs(w - verticalCuts[verticalCuts.length-1]);
        long res = (long) hmax*(long) vmax;

        return (int)(res%1000000007);
    }
}
