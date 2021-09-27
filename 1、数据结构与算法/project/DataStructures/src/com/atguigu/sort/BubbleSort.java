package com.atguigu.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, -2, 10};

        boolean blag = false;// 表示，是否进行过交换
        int temp = 0;// 中间变量
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    blag = true;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.println("第"+j+"躺排序");
            System.out.println(Arrays.toString(arr));
            if (!blag){
                break;
            }else {
                blag = false;// 充值2，进行下次循环
            }
        }
    }
}
