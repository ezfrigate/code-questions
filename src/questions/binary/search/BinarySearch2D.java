package questions.binary.search;

/**
 * <div class="px-5 pt-4"><div class="_1l1MA"><p>You are given an <code>m x n</code> integer matrix <code>matrix</code> with the following two properties:</p>
 *
 * <ul>
 * 	<li>Each row is sorted in non-decreasing order.</li>
 * 	<li>The first integer of each row is greater than the last integer of the previous row.</li>
 * </ul>
 *
 * <p>Given an integer <code>target</code>, return <code>true</code> <em>if</em> <code>target</code> <em>is in</em> <code>matrix</code> <em>or</em> <code>false</code> <em>otherwise</em>.</p>
 *
 * <p>You must write a solution in <code>O(log(m * n))</code> time complexity.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/10/05/mat.jpg" style="width: 322px; height: 242px;">
 * <pre><strong>Input:</strong> matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * <strong>Output:</strong> true
 * </pre>
 *
 * <p><strong class="example">Example 2:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/10/05/mat2.jpg" style="width: 322px; height: 242px;">
 * <pre><strong>Input:</strong> matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * <strong>Output:</strong> false
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>m == matrix.length</code></li>
 * 	<li><code>n == matrix[i].length</code></li>
 * 	<li><code>1 &lt;= m, n &lt;= 100</code></li>
 * 	<li><code>-10<sup>4</sup> &lt;= matrix[i][j], target &lt;= 10<sup>4</sup></code></li>
 * </ul>
 * </div></div>
 */
public class BinarySearch2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        int low = 0,high = m*n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(matrix[mid/m][mid%m]==target)
                return true;
            if(matrix[mid/m][mid%m]<target)
                low = mid+1;
            else
                high = mid-1;
        }return false;
    }
}
