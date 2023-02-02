package questions.linked.list;

public class FindDupe {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            nums[(nums[i]-1)%nums.length] = nums[(nums[i]-1)%nums.length] + nums.length;
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] / nums.length >= 2){
                return i+1;
            }
        }
        return -1;
    }
}
