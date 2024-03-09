package 栈;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class 有效的括号 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(pairs.containsKey(c)){
                if(stack.isEmpty() || stack.peek() != pairs.get(c)){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
