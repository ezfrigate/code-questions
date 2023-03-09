package questions.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permuteList = new ArrayList<>();
        permuteList.add(new ArrayList<>());
        return generatePermutations(permuteList, nums, 0);
    }

    public static List<List<Integer>> generatePermutations(List<List<Integer>> currentList, int[] nums, int currentIndex){
        List<List<Integer>> appendToCurrentList = new ArrayList<>();
        currentList.forEach(list->{
            for(int i=0; i<list.size()+1; i++){
                List<Integer> newPermute = new ArrayList<>(list);
                newPermute.add(i, nums[currentIndex]);
                appendToCurrentList.add(newPermute);
            }
        });
        if(currentIndex < nums.length-1){
            return generatePermutations(appendToCurrentList, nums, currentIndex+1);
        } else {
            return appendToCurrentList;
        }
    }
}
