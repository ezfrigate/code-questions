package questions.two.pointers.medium;

import java.util.*;

public class TwoSumII {
    private TwoSumII(){}

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0;
        while(numbers[i] <= target){
            if(map.keySet().contains(target-numbers[i])) return new int[]{i, map.get(target-numbers[i])};
            map.put(numbers[i], i);
        }
        return null;
    }

    public static int[] twoSumNew(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(true){
            if(numbers[left]+numbers[right] == target) return new int[]{left+1,right+1};
            if(numbers[left]+numbers[right] > target) right--;
            else left++;
        }
    }
}
