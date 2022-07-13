package questions.arrays.hashing.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * <div>
 *    <p>Determine if a&nbsp;<code>9 x 9</code> Sudoku board&nbsp;is valid.&nbsp;Only the filled cells need to be validated&nbsp;<strong>according to the following rules</strong>:</p>
 *    <ol>
 *       <li>Each row&nbsp;must contain the&nbsp;digits&nbsp;<code>1-9</code> without repetition.</li>
 *       <li>Each column must contain the digits&nbsp;<code>1-9</code>&nbsp;without repetition.</li>
 *       <li>Each of the nine&nbsp;<code>3 x 3</code> sub-boxes of the grid must contain the digits&nbsp;<code>1-9</code>&nbsp;without repetition.</li>
 *    </ol>
 *    <p><strong>Note:</strong></p>
 *    <ul>
 *       <li>A Sudoku board (partially filled) could be valid but is not necessarily solvable.</li>
 *       <li>Only the filled cells need to be validated according to the mentioned&nbsp;rules.</li>
 *    </ul>
 *    <p>&nbsp;</p>
 *    <p><strong>Example 1:</strong></p>
 *    <img src="src/assets/Sudoku-by-L2G-20050714.png" style="height:250px; width:250px">
 *    <pre><strong>Input:</strong> board =
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * <strong>Output:</strong> true
 * </pre>
 *    <p><strong>Example 2:</strong></p>
 *    <pre><strong>Input:</strong> board =
 * [["8","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * <strong>Output:</strong> false
 * <strong>Explanation:</strong> Same as Example 1, except with the <strong>5</strong> in the top left corner being modified to <strong>8</strong>. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 * </pre>
 *    <p>&nbsp;</p>
 *    <p><strong>Constraints:</strong></p>
 *    <ul>
 *       <li><code>board.length == 9</code></li>
 *       <li><code>board[i].length == 9</code></li>
 *       <li><code>board[i][j]</code> is a digit <code>1-9</code> or <code>'.'</code>.</li>
 *    </ul>
 * </div>
 */
public class IsValidSuDoKu {

    private IsValidSuDoKu(){}

    public static boolean isValidSudoku(char[][] board) {
        //box number = array index.
        //  0   1   2
        //  3   4   5
        //  6   7   8
        ArrayList[] box = new ArrayList[9];
        for(int m = 0; m<9; m++){
            box[m] = new ArrayList<>();
        }
        //loop of 9 int row
        for (int j=0; j<9; j++){
            Set<Integer> tempSet = new HashSet<>(9);
            for (int i=0; i<9; i++){
                if(board[j][i] != '.'){
                    if(tempSet.contains((int)(board[j][i]))){
                        return false;
                    } else {
                        tempSet.add((int) board[j][i]);
                    }

                    if(box[(j/3)*3 + i/3].contains((int)(board[j][i]))){
                        return false;
                    } else {
                        box[(j/3)*3 + i/3].add((int)(board[j][i]));
                    }
                }
            }
        }

        for (int i=0; i<9; i++){
            Set<Integer> tempSet = new HashSet<>();
            for (int j=0; j<9; j++){
                if(board[j][i] != '.'){
                    if(tempSet.contains((int)(board[j][i]))){
                        return false;
                    } else {
                        tempSet.add((int)(board[j][i]));
                    }
                }
            }
        }
        return true;
    }
}
