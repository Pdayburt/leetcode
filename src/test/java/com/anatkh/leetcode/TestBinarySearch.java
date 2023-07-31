package com.anatkh.leetcode;

import com.anatkh.leetcode.algorithm.binarysearch.BinarySearch;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class TestBinarySearch {

    @Test
    public void test2(){
        int[] arr = {7,13,21,30,38,44,52,53};
        System.out.println(BinarySearch.binarySearchBasic(arr, 7));
        System.out.println(BinarySearch.binarySearchBasic(arr, 13));
        System.out.println(BinarySearch.binarySearchBasic(arr, 21));
        System.out.println(BinarySearch.binarySearchBasic(arr, 30));
        System.out.println(BinarySearch.binarySearchBasic(arr, 38));
        System.out.println(BinarySearch.binarySearchBasic(arr, 44));
        System.out.println(BinarySearch.binarySearchBasic(arr, 52));
        System.out.println(BinarySearch.binarySearchBasic(arr, 53));
        System.out.println(BinarySearch.binarySearchBasic(arr, -1));
        System.out.println(BinarySearch.binarySearchBasic(arr, 35));
        System.out.println(BinarySearch.binarySearchBasic(arr, 55));
    }

    @Test
    public void test3(){
        int[] arr = {7,13,21,30,38,44,52,53};
        System.out.println(BinarySearch.binarySearchAlternative(arr, 7));
        System.out.println(BinarySearch.binarySearchAlternative(arr, 13));
        System.out.println(BinarySearch.binarySearchAlternative(arr, 21));
        System.out.println(BinarySearch.binarySearchAlternative(arr, 30));
        System.out.println(BinarySearch.binarySearchAlternative(arr, 38));
        System.out.println(BinarySearch.binarySearchAlternative(arr, 44));
        System.out.println(BinarySearch.binarySearchAlternative(arr, 52));
        System.out.println(BinarySearch.binarySearchAlternative(arr, 53));
        System.out.println(BinarySearch.binarySearchAlternative(arr, -1));
        System.out.println(BinarySearch.binarySearchAlternative(arr, 35));
        System.out.println(BinarySearch.binarySearchAlternative(arr, 55));
    }
    @Test
    public void test1(){
        int i = 1;
        int j = Integer.MAX_VALUE-1;
        int m = (i+j)/2;
        i = m+1;
        System.out.println( i );
        System.out.println(j);
        System.out.println((i+j));
        System.out.println((i+j)>>>1);
        System.out.println((i+j)>>1);
    }

    @Test
    public void testInsert(){

        int[] arr = {2,5,8};
        int target = 4;
        int i = Arrays.binarySearch(arr, target);
        System.out.println(i);
        if (i < 0) {
            int insertIndex = Math.abs(i) - 1;
            System.out.println(insertIndex);
            int[] newArr = new int[arr.length + 1];
            System.arraycopy(arr,0,newArr,0,insertIndex);
            newArr[insertIndex] = target;
            System.arraycopy(arr,insertIndex,newArr,insertIndex+1,arr.length-insertIndex);
            System.out.println(Arrays.toString(newArr));
        }

    }
}
