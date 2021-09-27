package com.atguigu.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {101,34,120,1};
        insertSort(arr);
    }

    /**
     * 插入排序
     * @param arr
     */
    public static void insertSort(int[] arr){
        for (int i = 1;i < arr.length;i++) {
            // 固定第一位的数，使之作为有序数。然后取出其后一个值进行插入
            int insertArr = arr[i];
            int insertIndex = i-1;

            // 寻找插入的位置小-大（小的后挪，大的往前让位）
        /*
        insertIndex >= 0防止数组下标越界
        insertArr < arr[insertIndex]判断插入值与有序数的大小
         */
            while (insertIndex >= 0 && insertArr < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];// 有序数大的话就将自己向后挪一位进行保存
                insertIndex--;
            }

            if (insertIndex+1 != i){
                arr[insertIndex + 1] = insertArr;// 将最小的数放置在原来有序数的位置处，因为前边要多执行一次判断，因此insertIndex + 1
            }

            System.out.println("第"+i+"轮插入：");
            System.out.println(Arrays.toString(arr));
        }
    }
}
