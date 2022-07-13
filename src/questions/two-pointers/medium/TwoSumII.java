package questions.two.pointers.medium;

import java.util.HashSet;
import java.util.Set;

public class TwoSumII {
    private TwoSumII(){}

    public static int[] twoSum(int[] numbers, int target) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; numbers[i] < target; i++){
            set.add(numbers[i]);
        }
    }
}
