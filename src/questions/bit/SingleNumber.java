package questions.bit;

import java.util.Arrays;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        //even occurence will nullify
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }


}
