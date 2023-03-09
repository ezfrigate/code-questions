package main.pack;

import jdk.nashorn.internal.runtime.logging.Logger;
import questions.Newclass;
import questions.arrays.hashing.medium.IsValidSuDoKu;
import questions.backtrack.NQueens;
import questions.backtrack.Permutations;
import questions.backtrack.Subsets;

import questions.dfs.MaxAreaOfIsland;
import questions.dfs.NumberOfIslands;
import questions.linked.list.ListNode;
import questions.linked.list.Merge2Lists;
import questions.linked.list.ReorderList;
import questions.random.NegativeBin;

import static java.lang.System.out;

@Logger
public class MainClass {
    public static void main(String[] args){

        //out.println(ContainsDuplicate.containsDuplicate(new int[]{1,2,3,4,5,6,7,7}));

        //out.println(IsAnagram.isAnagram("anagram", "naaramg"));

        //out.println(Arrays.toString(TwoSum.twoSum(new int[]{2, 7, 11, 9}, 9)));

        //out.println(GroupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));

        //out.println(Arrays.toString(TopKFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));

        //out.println(Arrays.toString(ProductOfArrayExceptSelf.productExceptSelf(new int[]{1, 4, 9, 13, 0})));

//        out.println(IsValidSuDoKu.isValidSudoku(new char[][]{
//                {'5','3','.','.','7','.','.','.','.'}
//                ,{'6','.','.','1','9','5','.','.','.'}
//                ,{'.','9','8','.','.','.','.','6','.'}
//                ,{'8','.','.','.','6','.','.','.','3'}
//                ,{'4','.','.','8','.','3','.','.','1'}
//                ,{'7','.','.','.','2','.','.','.','6'}
//                ,{'.','6','.','.','.','.','2','8','.'}
//                ,{'.','.','.','4','1','9','.','.','5'}
//                ,{'.','.','.','.','8','.','.','7','9'}
//        }));
        //out.println(LongestConsecutiveSequence.longestConsecutive(new int[]{0,3,7,2,3,8,4,6,0,1}));

        //out.println(ValidPalindrome.isPalindrome2("A man, a plan, a canal: Panama"));

        //out.println(Arrays.toString(TwoSumII.twoSum(new int[]{2, 7, 11, 15}, 9)));

        //out.println(ThreeSum.threeSum(new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0}));
        //out.println(ThreeSum.threeSum(new int[]{5,0,4,0,0}));
        //out.println(ThreeSum.threeSum(new int[]{-1,0,1,0}));

        //out.println(ContainerMaxArea.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        //out.println(ContainerMaxArea.maxArea(new int[]{1,1}));
        //out.println(ContainerMaxArea.maxArea(new int[]{1,2,1}));
        //out.println(ContainerMaxArea.maxArea(new int[]{1,2,4,3}));

        //out.println(TrappedWater.trap(new int[]{4,2,3}));
        //out.println(TrappedWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));

        //out.println(LongestSubString.lengthOfLongestSubstring("dvdf"));

        //out.println(ValidParentheses.isValid("()"));

        /*

        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        out.println(minStack.getMin());
        minStack.pop();
        out.println(minStack.getMin());
        minStack.pop();
        out.println(minStack.getMin());
        minStack.pop();
        out.println(minStack.getMin());

         */

        //out.println(RPN.evalRPN(new String[]{"2","1","+","3","*"}));

        //out.println(GenerateParentheses.generateParenthesis(8));

        //out.println(Newclass.getBestIndex(new int[]{-3, 2, 3, -4, 3, 1}));

//        out.println(Random.search(new int[]{4,5,6,7,8,0,1,2}, 0));
//        out.println(Random.search(new int[]{4,5,6,7,8,0,1,2}, 8));
//        out.println(Random.search(new int[]{4,5,6,7,0,1,2}, 0));
//        out.println(Random.search(new int[]{4,5,6,7,0,1,2}, 7));
//        out.println(Random.search(new int[]{1,3}, 0));
//        out.println(Random.search(new int[]{3,1}, 0));
//        out.println(Random.search(new int[]{3,4,5,1,2}, 4));
//        out.println(Random.search(new int[]{1,2,3,4,0}, 4));
//        int[] A = new int[]{3, 4, 6, 7, 5, 2};
//        MergeSort.sort(0, A.length-1, A);
//        out.println(Arrays.toString(A));

//        char[][] grid = new char[][]{
//                {'1','1','1','1','0'},
//                {'1','1','1','1','0'},
//                {'1','1','0','0','0'},
//                {'1','1','1','0','0'}
//        };
//
//        out.println(NumberOfIslands.numIslands(grid));
//        out.println(MaxAreaOfIsland.maxAreaOfIsland(grid));

//        ListNode l = new ListNode(1);
//        l.next = new ListNode(2);
//        l.next.next = new ListNode(3);
//
//        ListNode r = new ListNode(1);
//        r.next = new ListNode(3);
//        r.next.next = new ListNode(5);
//
//        System.out.println(Merge2Lists.mergeTwoLists(l,r));
//
////        out.println(Subsets.subsets2(new int[]{1,2}));
//
////        out.println(Permutations.permute(new int[]{1,2,3,4}));
//
//        out.println(NQueens.solveNQueens(4));

//        ListNode l = new ListNode(1);
//        l.next = new ListNode(2);
//        l.next.next = new ListNode(3);
//
//        ListNode r = new ListNode(4);
//        l.next.next.next = r;
//        r.next = new ListNode(5);
//        r.next.next = new ListNode(6);
//
//        ReorderList.reorderList(l);
//        l.printList();
//
        int[] array = NegativeBin.convertDecimalToBin(-40);
        for(int i=0; i<10; i++) {
            System.out.print(array[i]);
        }
        System.out.println(NegativeBin.convertBinToDecimal("0001111100"));
    }
}
