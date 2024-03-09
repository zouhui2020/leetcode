package 栈;

import java.util.ArrayDeque;
import java.util.Deque;

public class 字符串解码 {
    public static void main(String[] args) {

        System.out.println(decodeString("100[leetcode]"));
    }

    public static String decodeString(String s) {
        Deque<Character> cStack = new ArrayDeque();
        Deque<Integer> nStack = new ArrayDeque();
        StringBuilder res = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int j = i + 1;
                int sum = c - '0';
                while (s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                    sum = sum * 10 + s.charAt(j) - '0';
                    j++;
                    i++;
                }
                nStack.push(sum);
                flag = true;
            } else {
                if (flag) {
                    if (c == ']') {
                        StringBuilder sb = new StringBuilder();
                        while (cStack.peek() != '[') {
                            sb.insert(0, cStack.pop());
                        }
                        StringBuilder temp = new StringBuilder();
                        int rep = nStack.pop();
                        for (int j = 0; j < rep; j++) {
                            temp.append(sb);
                        }
                        cStack.pop();
                        if (cStack.isEmpty()) {
                            res.append(temp);
                            flag = false;
                        } else {
                            for (int k = 0; k < temp.length(); k++) {
                                cStack.push(temp.charAt(k));
                            }
                        }

                    } else {
                        cStack.push(c);
                    }
                } else {
                    res.append(c);
                }
            }
        }
        return res.toString();
    }
}
