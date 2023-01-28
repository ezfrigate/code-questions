package questions.two.pointers.medium;

import java.util.*;

public class ThreeSum {

    private ThreeSum(){}

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int zeroCount = 0;
        for(int num : nums) {
            if(num == 0){
                zeroCount++;
            }
            list.add(num);
        }
        while (list.size()>2){
            for(int j=1; j< list.size()-1; j++){
                for(int i=j+1; i<list.size(); i++){
                    if(list.get(0) + list.get(j) + list.get(i) == 0){
                        List<Integer> answerElement = new ArrayList<>();
                        answerElement.add(list.get(0));
                        answerElement.add(list.get(i));
                        answerElement.add(list.get(j));
                        Collections.sort(answerElement);
                        if(!answer.contains(answerElement)) {
                            answer.add(answerElement);
                        }
                    }
                }
            }
            list.removeIf(i-> Objects.equals(i, list.get(0)));
        }
        if(zeroCount >= 3){
            List<Integer> answerElement = new ArrayList<>();
            answerElement.add(0);
            answerElement.add(0);
            answerElement.add(0);
            if(!answer.contains(answerElement)) {
                answer.add(answerElement);
            }
        }
        return answer;
    }


}
