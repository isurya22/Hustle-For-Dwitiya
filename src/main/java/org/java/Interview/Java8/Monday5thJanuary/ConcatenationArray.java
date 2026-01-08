package org.java.Interview.Java8.Monday5thJanuary;

import java.util.Arrays;

public class ConcatenationArray {

    public static int[] getConcatenation(int[] nums){
        int n = nums.length;   // Length of original array
        int[] ans = new int[2 * n];   // New array of size 2n

        for (int i = 0; i < n; i++){
           ans[i] = nums[i];    // Copy to first half
           ans[i + n] = nums[i];  // Copy to second half
        }
        return ans;
    }

    public static void main(String[] args) {
       int[] nums = {1,2,1};
       int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
