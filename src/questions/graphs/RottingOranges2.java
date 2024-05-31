package questions.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RottingOranges2 {
    class Node{
        public int val;
        public int r;
        public int c;
        public Node() {
            val = 0;
        }
        public Node(int _val, int r, int c) {
            this.val = _val;
            this.r = r;
            this.c = c;
        }
    }
    int maxtime = -1;
    int fresh =0;
    public int orangesRotting(int[][] grid) {
        Queue<Node> rottenNodes = new LinkedList<>();
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[row].length; col++){
                if(grid[row][col] == 2){
                    rottenNodes.add(new Node(0,row, col));
                } else if(grid[row][col] == 1){
                    fresh++;
                }
            }
        }
        while(!rottenNodes.isEmpty() && fresh!=0) {
            Node rottenNode = rottenNodes.poll();
            int r = rottenNode.r;
            int c = rottenNode.c;
            if (r > 0 && grid[r - 1][c] == 1) {
                grid[r- 1][c] = 2;
                rottenNodes.add(new Node(rottenNode.val + 1, r - 1, c));
                fresh--;
            }
            if (r < grid.length - 1 && grid[r + 1][c] == 1) {
                grid[r + 1][c] = 2;
                rottenNodes.add(new Node(rottenNode.val + 1, r + 1, c));
                fresh--;
            }
            if (c > 0 && grid[r][c - 1] == 1) {
                grid[r][c - 1] = 2;
                rottenNodes.add(new Node(rottenNode.val + 1, r, c - 1));
                fresh--;
            }
            if (c < grid[0].length - 1 && grid[r][c + 1] == 1) {
                grid[r][c + 1] = 2;
                rottenNodes.add(new Node(rottenNode.val + 1, r,c + 1));
                fresh--;
            }
            maxtime = Math.max(rottenNode.val+1, maxtime);
        }
        if(fresh!=0) return -1;
        return maxtime;
    }
}
