package org.java.PushForCode;

public class FirstSecondThirdLargestNumber {
    public static void main(String[] args) {
        int[] numberList = {23, 13, 43, 33, 66, 77, 0, 2, 5, 10};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int j : numberList) {
            if (j > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = j;
            } else if (j > secondLargest && j != firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = j;
            } else if (j > thirdLargest && j != secondLargest && j != firstLargest) {
                thirdLargest = j;
            }
        }
        System.out.println("First Largest: " + firstLargest);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Third Largest: " + thirdLargest);
    }
}
