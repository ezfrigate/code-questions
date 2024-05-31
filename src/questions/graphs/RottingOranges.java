package questions.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <div class="_1l1MA"><p>You are given an <code>m x n</code> <code>grid</code> where each cell can have one of three values:</p>
 *
 * <ul>
 * 	<li><code>0</code> representing an empty cell,</li>
 * 	<li><code>1</code> representing a fresh orange, or</li>
 * 	<li><code>2</code> representing a rotten orange.</li>
 * </ul>
 *
 * <p>Every minute, any fresh orange that is <strong>4-directionally adjacent</strong> to a rotten orange becomes rotten.</p>
 *
 * <p>Return <em>the minimum number of minutes that must elapse until no cell has a fresh orange</em>. If <em>this is impossible, return</em> <code>-1</code>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2019/02/16/oranges.png" style="width: 650px; height: 137px;">
 * <pre><strong>Input:</strong> grid = [[2,1,1],[1,1,0],[0,1,1]]
 * <strong>Output:</strong> 4
 * </pre>
 *
 * <p><strong class="example">Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> grid = [[2,1,1],[0,1,1],[1,0,1]]
 * <strong>Output:</strong> -1
 * <strong>Explanation:</strong> The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
 * </pre>
 *
 * <p><strong class="example">Example 3:</strong></p>
 *
 * <pre><strong>Input:</strong> grid = [[0,2]]
 * <strong>Output:</strong> 0
 * <strong>Explanation:</strong> Since there are already no fresh oranges at minute 0, the answer is just 0.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>m == grid.length</code></li>
 * 	<li><code>n == grid[i].length</code></li>
 * 	<li><code>1 &lt;= m, n &lt;= 10</code></li>
 * 	<li><code>grid[i][j]</code> is <code>0</code>, <code>1</code>, or <code>2</code>.</li>
 * </ul>
 * </div>
 */
public class RottingOranges {

    class Node{
        public int r;
        public int c;
        public Node() {
        }
        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    int currentMin = -1;
    int fresh = 0;
    public int orangesRotting(int[][] grid) {
        Set<Node> rottenNodes = new HashSet<>();
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[row].length; col++){
                if(grid[row][col] == 2){
                    rottenNodes.add(new Node(row, col));
                } else if(grid[row][col] == 1){
                    fresh++;
                }
            }
        }
        start(rottenNodes, grid);
        if (fresh !=0) return -1;
        return currentMin;
    }
    public void start(Set<Node> rottenNodes, int[][] grid){
        currentMin++;
        Set<Node> newlyRotten = new HashSet<>();
        rottenNodes.forEach(rottenNode->{
            if(rottenNode.r > 0 && grid[rottenNode.r -1][rottenNode.c] == 1){
                grid[rottenNode.r -1][rottenNode.c] = 2;
                newlyRotten.add(new Node(rottenNode.r -1,rottenNode.c));
                fresh--;
            }
            if(rottenNode.r < grid.length-1 && grid[rottenNode.r +1][rottenNode.c] == 1){
                grid[rottenNode.r +1][rottenNode.c] = 2;
                newlyRotten.add(new Node(rottenNode.r +1,rottenNode.c));
                fresh--;
            }
            if(rottenNode.c > 0&& grid[rottenNode.r][rottenNode.c -1] == 1){
                grid[rottenNode.r][rottenNode.c -1] = 2;
                newlyRotten.add(new Node(rottenNode.r,rottenNode.c -1));
                fresh--;
            }
            if(rottenNode.c < grid[0].length-1 && grid[rottenNode.r][rottenNode.c +1] == 1){
                grid[rottenNode.r][rottenNode.c +1] = 2;
                newlyRotten.add(new Node(rottenNode.r,rottenNode.c +1));
                fresh--;
            }
        });
        if(!newlyRotten.isEmpty()) {
            start(newlyRotten, grid);
        }
    }
}
