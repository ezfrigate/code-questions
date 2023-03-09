package questions.bit;

import static java.lang.Math.min;

public class Sum {
    public int getSum(int a, int b) {
        String num1 = Integer.toBinaryString(a);
        String num2 = Integer.toBinaryString(b);
        int carry = 1;
        StringBuilder answer = new StringBuilder();

        for(int i = min(num1.length()-1,num2.length()-1); i>=0; i++){
            answer.append((int) num1.charAt(i) ^ (int) num2.charAt(i) ^carry);
            carry = (int) num1.charAt(i) ^ (int) num2.charAt(i) ^carry;
        }
        return Integer.parseInt(answer.toString());
    }
}
