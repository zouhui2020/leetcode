import java.util.ArrayDeque;

public class 找出数组的串联值 {
    public static void main(String[] args) {

        int[] nums ={7,52,2,4};
        System.out.println(findTheArrayConcVal(nums));
//    队列    https://blog.csdn.net/nmsLLCSDN/article/details/123857239
//        ArrayDeque<Integer> deque = new ArrayDeque<>();
//        deque.add(1);//队首插入
//        deque.push(2);//队首插入
//        deque.push(3);
//        deque.offer(4);//队尾插入
//        deque.offer(5);
//        deque.push(6);
//        deque.addFirst(7);//队首插入
//        deque.addLast(8);//队尾插入
//        deque.removeLast();//队尾删除
//        deque.removeFirst();//队首删除
//        System.out.println(deque.peek());//获取队首元素
//        System.out.println(deque.element());//获取队首元素
//        System.out.println(deque.peekFirst());//获取队首元素
//        System.out.println(deque.peekLast());//获取队尾元素
//        System.out.println(deque.getFirst());//获取队首元素
//        System.out.println(deque.getLast());//获取队尾元素
//        System.out.println(deque.pop());//获取队首元素并队首删除
//        System.out.println(deque.poll());//获取队首元素并队首删除
//        System.out.println(deque);



    }
    public static long findTheArrayConcVal(int[] nums) {
        long results = 0l;

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            deque.offer(nums[i]);
        }
        while (deque.size() > 1){
            int first = deque.getFirst();
            int last = deque.getLast();
            int result = first;
            int temp =last;
            deque.removeFirst();
            deque.removeLast();
            while (last!=0){
                last /= 10;
                result *= 10;
            }
            result += temp;
            results += result;
        }
        if(deque.size()== 1){
            results += deque.getFirst();
        }
        return results;
    }
}
