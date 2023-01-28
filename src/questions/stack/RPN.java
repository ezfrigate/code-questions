package questions.stack;

import java.util.Objects;
import java.util.Stack;

public class RPN {

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (Objects.equals(token, "+") || Objects.equals(token, "-") || Objects.equals(token, "*") || Objects.equals(token, "/")) {
                int right = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(operate(token, Integer.parseInt(stack.pop()), right)));
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.peek());
    }

    private static int operate(String c, int left, int right){
        if(Objects.equals(c, "+")){
            return left+right;
        }
        if(Objects.equals(c, "-")){
            return left-right;
        }
        if(Objects.equals(c, "*")){
            return left*right;
        }
        if(Objects.equals(c, "/")){
            return left/right;
        }
        return 0;
    }
}
