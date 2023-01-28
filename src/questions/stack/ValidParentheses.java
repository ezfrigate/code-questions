package questions.stack;

import java.util.Stack;

public class ValidParentheses {

    /**
     * <div><p>Given a string <code>s</code> containing just the characters <code>'('</code>, <code>')'</code>, <code>'{'</code>, <code>'}'</code>, <code>'['</code> and <code>']'</code>, determine if the input string is valid.</p>
     *
     * <p>An input string is valid if:</p>
     *
     * <ol>
     * 	<li>Open brackets must be closed by the same type of brackets.</li>
     * 	<li>Open brackets must be closed in the correct order.</li>
     * </ol>
     *
     * <p>&nbsp;</p>
     * <p><strong>Example 1:</strong></p>
     *
     * <pre><strong>Input:</strong> s = "()"
     * <strong>Output:</strong> true
     * </pre>
     *
     * <p><strong>Example 2:</strong></p>
     *
     * <pre><strong>Input:</strong> s = "()[]{}"
     * <strong>Output:</strong> true
     * </pre>
     *
     * <p><strong>Example 3:</strong></p>
     *
     * <pre><strong>Input:</strong> s = "(]"
     * <strong>Output:</strong> false
     * </pre>
     *
     * <p>&nbsp;</p>
     * <p><strong>Constraints:</strong></p>
     *
     * <ul>
     * 	<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
     * 	<li><code>s</code> consists of parentheses only <code>'()[]{}'</code>.</li>
     * </ul>
     * </div>
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) return false;
                if(s.charAt(i)==']'){
                    char c = stack.pop();
                    if(c!='[') return false;
                } else if (s.charAt(i)=='}') {
                    char c = stack.pop();
                    if(c!='{') return false;
                } else if (s.charAt(i)==')') {
                    char c = stack.pop();
                    if(c!='(') return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
