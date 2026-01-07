package org.java.Practice;

import java.util.Arrays;

public class ConcatenationArrayP1 {

    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < n; i++) {
           ans[i] = nums[i];
           ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        int[] results = getConcatenation(nums);
        System.out.println(Arrays.toString(results));

    }
}
