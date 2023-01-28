package questions.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <div><p>Given <code>n</code> pairs of parentheses, write a function to <em>generate all combinations of well-formed parentheses</em>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <pre><strong>Input:</strong> n = 3
 * <strong>Output:</strong> ["((()))","(()())","(())()","()(())","()()()"]
 * </pre><p><strong>Example 2:</strong></p>
 * <pre><strong>Input:</strong> n = 1
 * <strong>Output:</strong> ["()"]
 * </pre>
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= n &lt;= 8</code></li>
 * </ul>
 * </div>
 */
public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        Stack<Character> ongoingStack = new Stack();
        keepCreating(ongoingStack,"", n, n,answer);
        return answer;
    }

    private static void keepCreating(Stack<Character> ongoingStack, String ongoingString, int leftBrackets, int rightBrackets, List<String> answer){
        if(rightBrackets>0) {
            if (ongoingStack.isEmpty()) {
                if (leftBrackets > 0) {
                    Stack<Character> tempStack = (Stack<Character>) ongoingStack.clone();
                    tempStack.push('(');
                    keepCreating(tempStack, ongoingString + '(', leftBrackets - 1, rightBrackets, answer);
                } else {
                }
            } else {
                Stack<Character> tempStack = (Stack<Character>) ongoingStack.clone();
                if(leftBrackets>0) {
                    tempStack.push('(');
                    keepCreating(tempStack, ongoingString + '(', leftBrackets - 1, rightBrackets, answer);
                }
                if (ongoingStack.peek() == '(') {
                    Stack<Character> tempStack2 = (Stack<Character>) ongoingStack.clone();
                    tempStack2.pop();
                    keepCreating(tempStack2, ongoingString + ')', leftBrackets, rightBrackets - 1, answer);
                }
            }
        } else {
            answer.add(ongoingString);
        }
    }
}
