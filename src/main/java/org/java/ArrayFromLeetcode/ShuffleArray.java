package org.java.ArrayFromLeetcode;

import java.util.Arrays;

public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        //Loop through first n elements
        for (int i = 0; i < n; i++){
            result[index++] = nums[i];
            result[index++] = nums[i+n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] result = ShuffleArray.shuffle(nums,n);
        System.out.println(Arrays.toString(result));
    }
}
