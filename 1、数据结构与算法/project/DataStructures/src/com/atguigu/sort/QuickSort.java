package com.atguigu.sort;

import java.util.Arrays;

/**
 * @ProjectName: DataStructures
 * @Package: com.atguigu.sort
 * @ClassName: QuickSort
 * @author: mengjianglong
 * @description: 快速排序
 * @date: 2021/4/6 21:24
 * @version: 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-9, 78, 0, 23, -567, 70};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];// 中间值

        int temp = 0;// 临时变量
        while (l < r) {
            // 在pivot左边一直找，找到大于pivot的值
            while (arr[l] < pivot) {
                l += 1;
            }

            while (arr[r] > pivot) {
                r -= 1;
            }

            if (l >= r) {
                break;
            }

            // 交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            // 如果交换完成发现arr[l] = pivot值，相等--前移
            if (arr[l] == pivot) {
                r -= 1;
            }

            // 如果交换完成发现arr[r] = pivot值，相等--前移
            if (arr[r] == pivot) {
                l += 1;
            }
        }

        // 如果l == r,必须l++，r--，防止栈溢出
        if (l==r){
            l+=1;
            r-=1;
        }

        // 向左递归
        if (left<r){
            quickSort(arr,left,r);
        }

        // 向右递归
        if (right>l){
            quickSort(arr,l,right);
        }
    }
}

