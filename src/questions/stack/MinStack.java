package questions.stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    private List<Integer> minStack;
    private int min;
    public MinStack() {
        min = Integer.MAX_VALUE;
        minStack = new ArrayList<>();
    }

    public void push(int val) {
        minStack.add(val);
        if(val < min){
            min = val;
        }
    }

    public void pop() {
        if(minStack.get(minStack.size()-1) == min){
            minStack.remove(minStack.size()-1);
            min = minStack.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);
        } else {
            minStack.remove(minStack.size()-1);
        }
    }

    public int top() {
        return minStack.get(minStack.size()-1);
    }

    public int getMin() {
        return min;
    }
}
