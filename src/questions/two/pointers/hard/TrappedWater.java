package questions.two.pointers.hard;

public class TrappedWater {

    public static int trap(int[] height) {
        int left = 0;
        int leftMax = 0;
        int right = height.length-1;
        int rightMax = 0;
        int water = 0;
        while(left<right){
            if(height[left] > height[right]){
                if(height[right]>rightMax){
                    rightMax = height[right];
                } else {
                    water = water + rightMax - height[right];
                }
                right--;
            } else {
                if(height[left]>leftMax){
                    leftMax = height[left];
                } else {
                    water = water + leftMax - height[left];
                }
                left++;
            }
        }
        return water;
    }
}
