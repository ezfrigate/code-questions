package questions.arrays.hashing.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.asList(arr);

        int diff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            diff = Math.min(diff,arr[i+1]-arr[i]);
        }

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==diff){
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return result;
    }
}
