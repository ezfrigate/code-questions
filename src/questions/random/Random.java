package questions.random;

public class Random {
    //given rotated sorted array
    //find a number
    public static int search(int[] nums, int target) {
        //find pivot, pivot is the least element
        return binarySearch(nums, target, findPivot(nums));
    }

    public static int findPivot(int[] nums){
        if(nums[0] < nums[nums.length-1]){
            return 0;
        } else {
            int low = 0;
            int high = nums.length - 1;
            while (low < high) {
                if (nums[(low + high) / 2] >= nums[0]) {
                    low = (low + high) / 2 + 1;
                } else {
                    high = (low + high) / 2 - 1;
                }
            }
            return nums[low] > nums[(low + 1) % nums.length] ? (low + 1) : low;
        }
    }

    public static int binarySearch(int[] nums, int target, int pivotIndex){
        if(nums.length==1){
            if(target==nums[0]){
                return 0;
            } else{
                return -1;
            }
        }

        int low=pivotIndex;
        int high=nums.length + pivotIndex -1;

        while(low<=high){
            int mid=(low+(high-low)/2);
            if(nums[mid%nums.length]==target) return mid%nums.length;
            if(nums[mid%nums.length]<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
