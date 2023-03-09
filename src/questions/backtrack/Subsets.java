package questions.backtrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        for (int num : nums) {
            answer = recursive(answer, num);
        }
        return answer;
    }

    public static List<List<Integer>> recursive(List<List<Integer>> answer, int i){
        List<List<Integer>> answerReplica = new ArrayList<>();
        answer.forEach(list->{
            List<Integer> L1 = new ArrayList<>(list);
            List<Integer> L2 = new ArrayList<>(list);
            L2.add(i);
            answerReplica.add(L1);
            answerReplica.add(L2);
        });
        return answerReplica;
    }

    public static List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<String> allBitStrings = new ArrayList<>();
        for(int i = (int) Math.pow(2, nums.length); i< (int) Math.pow(2, nums.length+1); i++){
            allBitStrings.add(Integer.toBinaryString(i));
        }
        allBitStrings.forEach(str->{
            List<Integer> member = new ArrayList<>();
            for(int i = 1; i< str.length(); i++){
                if(str.charAt(i) == '1') member.add(nums[i-1]);
            }
            answer.add(member);
        });
        return answer;
    }

}