package com.atguigu.sort;

import java.util.Arrays;

/**
 * @ProjectName: 希尔排序
 * @Package: com.atguigu.sort
 * @ClassName: ShellSort
 * @author: mengjianglong
 * @description:
 * @date: 2021/3/31 23:11
 * @version: 1.0
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        //shellSort(arr);
        shellMoveSort(arr);
    }

    /**
     * 交换法（慢）
     *
     * @param arr
     */
    public static void shellSort(int[] arr) {
        int temp = 0;
        // 分组规律
        for (int s = arr.length / 2; s > 0; s /= 2) {
            // 将数据分成s组
            for (int i = s; i < arr.length; i++) {
                // 遍历各组中的元素，（每组2个元素）
                for (int j = i - s; j >= 0; j -= s) {
                    // 判断每组中元素的大小并交换
                    if (arr[j] > arr[j + s]) {
                        temp = arr[j + s];
                        arr[j + s] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("希尔排序：" + Arrays.toString(arr));
        }
    }

    /**
     * 移动法（快）
     *
     * @param arr
     */
    public static void shellMoveSort(int[] arr) {
        for (int s = arr.length / 2; s > 0; s /= 2) {
            for (int i = s; i < arr.length; i++) {
                int j = i;
                int temp = arr[j]; // 固定每一组的一个值作为有序数
                if (arr[j] < arr[j - s]) {// 有序数小于了同组的另一个数时，需要移动
                    while (j - s >= 0 && temp < arr[j - s]) {
                        // 移动
                        arr[j] = arr[j - s];
                        j -= s;
                    }
                    arr[j] = temp;
                }
            }
            System.out.println("希尔排序：" + Arrays.toString(arr));
        }
    }
}
