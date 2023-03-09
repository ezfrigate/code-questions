package questions.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> sublist=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        int index=0;
        combination(candidates, target,index,sublist,list);
        return list;
    }
    public static void combination(int[] candidates, int target, int index, List<Integer> sublist, List<List<Integer>> list) {
        if (index== candidates.length){
            if (target==0){
                list.add(new ArrayList<>(sublist));
            }
            return;
        }
        if (candidates[index]<=target){
            sublist.add(candidates[index]);
            //- Taking the same index
            combination(candidates,target-candidates[index],index,sublist,list);
            sublist.remove(sublist.size()-1);
        }
        //- We will be increasing the index since above pick didn't make us to our desired answer.So,we will leave it (not pick)
        combination(candidates,target,index+1,sublist,list);
    }
}
