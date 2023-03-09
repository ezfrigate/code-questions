package questions.trees;

import java.util.Stack;

/**
 * <div class="px-5 pt-4"><div class="_1l1MA"><p>Given the <code>root</code> of a binary search tree, and an integer <code>k</code>, return <em>the</em> <code>k<sup>th</sup></code> <em>smallest value (<strong>1-indexed</strong>) of all the values of the nodes in the tree</em>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/01/28/kthtree1.jpg" style="width: 212px; height: 301px;">
 * <pre><strong>Input:</strong> root = [3,1,4,null,2], k = 1
 * <strong>Output:</strong> 1
 * </pre>
 *
 * <p><strong class="example">Example 2:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/01/28/kthtree2.jpg" style="width: 382px; height: 302px;">
 * <pre><strong>Input:</strong> root = [5,3,6,2,4,null,null,1], k = 3
 * <strong>Output:</strong> 3
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li>The number of nodes in the tree is <code>n</code>.</li>
 * 	<li><code>1 &lt;= k &lt;= n &lt;= 10<sup>4</sup></code></li>
 * 	<li><code>0 &lt;= Node.val &lt;= 10<sup>4</sup></code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 * <p><strong>Follow up:</strong> If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the kth smallest frequently, how would you optimize?</p>
 * </div></div>
 */
public class KTHSmallest {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        return prepareStack(root, stack, k);
    }

    private int prepareStack(TreeNode root, Stack<TreeNode> stack, int k){
        if(stack.size() == k) return root.val;
        if(root!=null && stack.size() <= k) {
            if(root.left != null) prepareStack(root.left, stack, k);
            stack.push(root);
            if(root.right != null) prepareStack(root.right, stack, k);
        }
        return -1;
    }

    int count;
    public int kthSmallest2(TreeNode root, int k) {
        count = k;
        return dfs(root);
    }

    int dfs(TreeNode node) {
        if (node == null) return -1;
        int ans = dfs(node.left);
        if (ans != -1) return ans;
        if (count == 1) return node.val;
        count--;
        return dfs(node.right);
    }
}
