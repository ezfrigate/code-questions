package questions.two.pointers.medium;

import java.util.ArrayList;
import java.util.List;

public class TwoSumII {
    private TwoSumII(){}

    public static int[] twoSum(int[] numbers, int target) {
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        for(int i = 0; numbers[i] < target/2 + 1; i++){
            if(list.contains(target-numbers[i])){
                if(list.indexOf(target-numbers[i]) == i){
                    return new int[]{i+1, list.indexOf(target-numbers[i])+2};
                }
                return new int[]{i+1, list.indexOf(target-numbers[i])+1};
            }
        }
        return new int[0];
    }
}
