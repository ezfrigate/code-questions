package questions.arrays.hashing.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        mergeSort(0, nums.length-1, nums);

        List<Integer> numsList = new ArrayList<>();
        List<List<Integer>> answerList = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            while(i>0 && nums[i]==nums[i-1] && i<nums.length-1){
                i++;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[i] + nums[j] + nums[k] < 0){
                    j++;
                    while (nums[j]==nums[j-1] && j<k)j++;
                }
                else if (nums[i] + nums[j] + nums[k] > 0){
                    k--;
                    while(nums[k]==nums[k+1] && j<k)k--;
                }
                else{
                    answerList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                    j++;
                    while(nums[j]==nums[j-1] && j<k)j++;
                    while(nums[k]==nums[k+1] && j<k)k--;
                }
            }
        }
        return answerList;
    }

    public void mergeSort(int low, int high, int[] array){
        int mid = (low+high)/2;
        if(low<high) {
            mergeSort(low, mid, array);
            mergeSort(mid + 1, high, array);
            merge(low, mid, high, array);
        }
    }

    public void merge(int low, int mid, int high, int[] array){
        int[] left = new int[mid-low+1];
        int[] right = new int[high-mid];

        for(int i=0; i< mid-low+1;i++){
            left[i] = array[low+i];
        }

        for(int i=0; i< high-mid; i++){
            right[i] = array[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=0;
        while(i<mid-low+1 && j< high-mid){
            if(left[i] < right[j]){
                array[low+k] = left[i];
                i++;
                k++;
            } else {
                array[low+k] = right[j];
                j++;
                k++;
            }
        }

        while(i<mid-low+1){
            array[low+k] = left[i];
            i++;
            k++;
        }

        while(j<high-mid){
            array[low+k] = right[j];
            j++;
            k++;
        }
    }
}
