package questions.sliding.window;

/**
 * <div class="_1l1MA" data-track-load="qd_description_content"><p>You are given an array of integers&nbsp;<code>nums</code>, there is a sliding window of size <code>k</code> which is moving from the very left of the array to the very right. You can only see the <code>k</code> numbers in the window. Each time the sliding window moves right by one position.</p>
 *
 * <p>Return <em>the max sliding window</em>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> nums = [1,3,-1,-3,5,3,6,7], k = 3
 * <strong>Output:</strong> [3,3,5,5,6,7]
 * <strong>Explanation:</strong>
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       <strong>3</strong>
 *  1 [3  -1  -3] 5  3  6  7       <strong>3</strong>
 *  1  3 [-1  -3  5] 3  6  7      <strong> 5</strong>
 *  1  3  -1 [-3  5  3] 6  7       <strong>5</strong>
 *  1  3  -1  -3 [5  3  6] 7       <strong>6</strong>
 *  1  3  -1  -3  5 [3  6  7]      <strong>7</strong>
 * </pre>
 *
 * <p><strong class="example">Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> nums = [1], k = 1
 * <strong>Output:</strong> [1]
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 * 	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
 * 	<li><code>1 &lt;= k &lt;= nums.length</code></li>
 * </ul>
 * </div>
 */
public class SlidingWindowMax {
    public static void main(String[] args){
        for (int element: maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)) {
            System.out.println(element);
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int max = 0;
        int maxIndex = 0;
        for(int i=0; i<k; i++){
            if(nums[i]>max){
                max = nums[i];
                maxIndex = i;
            } else if(nums[i]==max){
                maxIndex = i;
            }
        }

        int[] ans = new int[nums.length-k+1];

        for(int i=0; i<nums.length-k; i++){
            if(maxIndex == i-1){
                for(int t=maxIndex; t<k+maxIndex; t++){
                    if(nums[t]>max){
                        max = nums[t];
                        maxIndex = t;
                    } else if(nums[t]==max){
                        maxIndex = t;
                    }
                }
            }
            if(nums[k+i] > max){
                max = nums[k+i];
                maxIndex = k+i;
            } else if(nums[k+i] == max){
                maxIndex = k+i;
            }
            ans[i]= max;
        }
        return ans;
    }
}
