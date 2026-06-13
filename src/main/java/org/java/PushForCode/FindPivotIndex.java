package org.java.PushForCode;

public class FindPivotIndex {
    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] arr){
        int totalSum = 0;
        for (int number : arr){
            totalSum = totalSum + number;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum) {
                return i;
            }
            leftSum = leftSum + arr[i];
        }
        return -1;
    }
}
