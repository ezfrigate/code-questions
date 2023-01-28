package main.pack;

import jdk.nashorn.internal.runtime.logging.Logger;
import questions.Newclass;
import questions.arrays.hashing.medium.IsValidSuDoKu;
import questions.sliding.window.medium.LongestSubString;
import questions.stack.GenerateParentheses;
import questions.stack.MinStack;
import questions.stack.RPN;
import questions.stack.ValidParentheses;
import questions.two.pointers.easy.ValidPalindrome;
import questions.two.pointers.hard.TrappedWater;
import questions.two.pointers.medium.ContainerMaxArea;
import questions.two.pointers.medium.ThreeSum;
import questions.two.pointers.medium.TwoSumII;

import java.util.Arrays;
import java.util.function.Consumer;

import static java.lang.System.*;

@Logger
public class MainClass {
    public static void main(String[] args){

        //out.println(ContainsDuplicate.containsDuplicate(new int[]{1,2,3,4,5,6,7,7}));

        //out.println(IsAnagram.isAnagram("anagram", "naaramg"));

        //out.println(Arrays.toString(TwoSum.twoSum(new int[]{2, 7, 11, 9}, 9)));

        //out.println(GroupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));

        //out.println(Arrays.toString(TopKFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));

        //out.println(Arrays.toString(ProductOfArrayExceptSelf.productExceptSelf(new int[]{1, 4, 9, 13, 0})));

        out.println(IsValidSuDoKu.isValidSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        }));
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
    }
}
