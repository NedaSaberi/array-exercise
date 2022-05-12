package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    // public class Main {
//    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = getIntegers(10);
        printArray(myArray);
        int[] sorted = sortIntegers(myArray);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter number " + i + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
//        System.out.println("*********************");
//        System.out.println("   List of Numbers");
//        System.out.println("*********************");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        //int[] sortedArray = Arrays.copyOf(array, array.length);
        int[] sortedArray = new int [array.length];
        for (int i= 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        int temp;
        while (true) {
            int count = 0;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    count++;
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                }
            }
            if (count == 0)
                break;
        }
        return sortedArray;
    }
}


