package com.atguigu.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {103,52,2,8};
        selectSort(arr);
    }

    // 定义选择排序方法
    public static void selectSort(int[] arr){
        /**
         * 假设最小的值就在下表为0的位置
         */
        for (int i = 0;i<arr.length-1;i++) {
            int minSize = i;
            int min = arr[i];// 假设最小值

            // 第一轮
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    minSize = j;//置换下标
                    min = arr[j];// 置换最小值
                }
            }

            if (minSize!=i) {
                arr[minSize] = arr[i];// 将原arr[0]位置的数据放置到arr[minSize]
                arr[i] = min;// 将真正的最小值放置首位
            }

            System.out.println("第"+i+"躺排序");
            System.out.println(Arrays.toString(arr));
        }
    }
}
