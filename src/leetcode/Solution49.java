package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]
 */
public class Solution49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        char[][] chars = new char[strs.length][];
        for (int i = 0; i < chars.length; i++) {
            char[] array = new char[strs[i].length()];
            for (int j = 0; j < strs[i].length(); j++) {
                array[j] = strs[i].charAt(j);
            }
            Arrays.sort(array);
            chars[i] = array;
        }
        boolean[] isUse = new boolean[strs.length];
        for (int i = 0; i < chars.length; i++) {
            char[] arrayA = chars[i];
            List<String> strList = new ArrayList<>();
            if (isUse[i]) {
                continue;
            }
            strList.add(strs[i]);
            for (int j = 0; j < chars.length; j++) {
                char[] arrayB = chars[j];
                if (i == j) {
                    continue;
                }
                if (!isUse[j] && Arrays.equals(arrayA, arrayB)) {
                    isUse[j] = true;
                    strList.add(strs[j]);
                }
            }
            answer.add(strList);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
        System.out.println(groupAnagrams(new String[] {""}));
        System.out.println(groupAnagrams(new String[] {"a"}));
    }
}
