package questions.two.pointers.easy;

/**
 * <div>
 *    <p>A phrase is a <strong>palindrome</strong> if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.</p>
 *    <p>Given a string <code>s</code>, return <code>true</code><em> if it is a <strong>palindrome</strong>, or </em><code>false</code><em> otherwise</em>.</p>
 *    <p>&nbsp;</p>
 *    <p><strong>Example 1:</strong></p>
 *    <pre><strong>Input:</strong> s = "A man, a plan, a canal: Panama"
 * <strong>Output:</strong> true
 * <strong>Explanation:</strong> "amanaplanacanalpanama" is a palindrome.
 * </pre>
 *    <p><strong>Example 2:</strong></p>
 *    <pre><strong>Input:</strong> s = "race a car"
 * <strong>Output:</strong> false
 * <strong>Explanation:</strong> "raceacar" is not a palindrome.
 * </pre>
 *    <p><strong>Example 3:</strong></p>
 *    <pre><strong>Input:</strong> s = " "
 * <strong>Output:</strong> true
 * <strong>Explanation:</strong> s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 * </pre>
 *    <p>&nbsp;</p>
 *    <p><strong>Constraints:</strong></p>
 *    <ul>
 *       <li><code>1 &lt;= s.length &lt;= 2 * 10<sup>5</sup></code></li>
 *       <li><code>s</code> consists only of printable ASCII characters.</li>
 *    </ul>
 * </div>
 */
public class ValidPalindrome {
    private ValidPalindrome(){}
    public static boolean isPalindrome(String s) {
        if(s.isEmpty() || s.length()==1) {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return recurringPalindromeFinder(s);
    }

    private static boolean recurringPalindromeFinder(String s){
        if(s.isEmpty() || s.length()==1) {
            return true;
        } else if (s.charAt(0) == s.charAt(s.length()-1)) {
            return recurringPalindromeFinder(s.substring(1,s.length()-1));
        } else return false;
    }

    public static boolean isPalindrome1(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s.isEmpty() || s.length()==1) {
            return true;
        }
        for(int i=0; i<(s.length()/2 + 1); i++){
            if(s.charAt(i)!=s.charAt((s.length()-1)-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        if(s.isEmpty() || s.length()==1) {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s.isEmpty() || s.length()==1) {
            return true;
        }
        String s1 = s.substring(0, s.length() / 2);
        String s2 = new StringBuilder(s).reverse().substring(0, s.length() / 2);
        return s1.equals(s2);
    }
}
