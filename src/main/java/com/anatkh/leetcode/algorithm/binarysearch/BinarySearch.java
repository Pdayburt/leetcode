package com.anatkh.leetcode.algorithm.binarysearch;

public class BinarySearch {

    public static int binarySearchBasic(int[] arr,int target){
        int i = 0,j = arr.length -1;
        while ( i <= j) {
            int m = (i+j) >>> 1;
            if (arr[m] < target) {
                i = m+1;
            }else if ( target < arr[m] ){
                j = m-1;
            }else {
                return m;
            }
        }
        return -1;
    }

    public static int binarySearchAlternative(int[] arr,int target){
        int i = 0,j = arr.length;
        while (i < j) {
            int m = (i+j) >>> 1;
            if (arr[m] < target) {
                i = m+1;
            }else if (target < arr[m]){
                j = m;
            }else {
                return m;
            }
        }
        return -1;
    }
//    public static int binarySearchBalance(int[] arr,int target){
//
//        int i = 0,j = arr.length;
//        while (1 < j - i) {
//
//        }
//
//    }


}
