package ru.alserr;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr1[] = {1,1,0,0,1,0,1,1,0,0};
        swapArray(arr1);
        int arr2[] = {1,4,7,10,13,16,19,22};
        fillArray(arr2);
        int arr3[] = {1,5,3,2,11,4,5,2,4,8,9,1};
        increaseArrayByTwo(arr3);
        int arr4[] = {2,1,3,2,11,4,5,2,4,8,9,10};
        findMax(arr4);
        findMin(arr4);
        int[][] arr5 = new int[10][10];
        fillDiagonals(arr5);
        int arr6[] = {10,1,2,3,10};
        summator(arr6);
    }

    //Задание 1
    private static int[] swapArray(int [] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0){
                arr1[i] = 1;
            } else if (arr1[i] == 1){
                arr1[i] = 0;
            }
        }

        return arr1;
    }
    //Задание 2
    private static int[] fillArray(int[] arr2) {
        int arr2result[] = new int[8];
        for (int i = 0; i < arr2result.length; i++) {
            arr2result[i] = arr2[i];
        }
        return arr2result;
    }
    //Задание 3
    private static int[] increaseArrayByTwo(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6){
                arr3[i] = arr3[i]*2;
            }
        }
        return arr3;
    }
    //Задание 4a
    private static int findMin(int[] arr4) {
        Arrays.sort(arr4);
        return arr4[0];
    }
    //Задание 4b
    private static int findMax(int[] arr4) {
        int max = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] >= max){
                max = arr4[i];
            }
        }
        return max;
    }
    //Задание 5
    private static int[][] fillDiagonals(int[][] arr5) {
        int count = arr5.length;
        for (int i = 0; i < arr5.length; i++) {
            count--;
            for (int j = 0; j < arr5.length; j++) {

                if (arr5[i] == arr5[j]){
                    arr5[i][j] = 1;
                }
                if (arr5[j] == arr5[count] ){
                    arr5[i][j] = 1;
                }
                //System.out.printf("%2d ", arr5[i][j]);
            }
            //System.out.println();
        }
        return arr5;
    }
    //Задание 6
    private static boolean summator(int[] arr6) {
        int sumLeft = 0;
        int sumRight = 0;
        boolean result = true;
        int resultCount = 0;
        int nextElem = 0;
        for (int i = 0; i < arr6.length; i++) {
            sumRight = 0;
            nextElem++;
            sumLeft = sumLeft + arr6[i];
            for (int j = nextElem; j < arr6.length; j++) {
                sumRight = sumRight + arr6[j];
            }
            if (sumLeft == sumRight){
                resultCount++;
            }
            if (resultCount == 1){
                result = true;
            } else result = false;
        } return result;
    }
}

