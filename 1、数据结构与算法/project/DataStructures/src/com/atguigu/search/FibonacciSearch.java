package com.atguigu.search;

import java.util.Arrays;

/**
 * @ProjectName: DataStructures
 * @Package: com.atguigu.search
 * @ClassName: FibonacciSearch
 * @author: mengjianglong
 * @description: 斐波那契查找
 * @date: 2021/4/7 20:50
 * @version: 1.0
 */
public class FibonacciSearch {
    public static int maxSize = 20;
    public static void main(String[] args) {
        int[] arr = {1,8,10,89,1000,1234};
        System.out.println(fibSearch(arr,1234));
    }

    /**
     * 非递归得到一个斐波那契数列,mid = low+f(k-1)-1
     * @return
     */
    public static int[] fib(){
        int[] f = new int[maxSize];
        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i < maxSize; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f;
    }

    /**
     *
     * @param arr 数组
     * @param key 要查找的值
     * @return
     */
    public static int fibSearch(int[] arr,int key){
        int low = 0;
        int heigh = arr.length-1;
        int k = 0;// 斐波那契分割数值对应下标
        int mid = 0;

        int[] f = fib();// 获取到斐波那契数列
        while (heigh > f[k]-1){// 找到斐波那契下标
            k++;
        }

        // 因为f[k]的值可能大于arr的长度因此需要构造一个新的数组，不足部分使用0填充
        int[] temp = Arrays.copyOf(arr,f[k]);

        // 将填充的0改变为arr的最后一个元素
        for (int i = heigh+1; i < temp.length; i++) {
            temp[i] = arr[heigh];
        }

        // 使用循环找到key
        while(low <= heigh){
            mid = low + f[k-1] - 1;
            if (key < temp[mid]){// 向左查找
                heigh = mid - 1;
                // f[k] = f[k-1] + f[k-2]
                // 以为前面有 f[k-1]个元素，所以可以继续拆分f[k-1] = f[k-2] + f[k-3]，即在f[k-1]前面继续查找k--
                k--;
            }else  if (key > temp[mid]){// 向右查找
                low = mid + 1;
                // f[k] = f[k-1] + f[k-2]
                // 以为后面有 f[k-2]，所以可以继续拆分f[k-1] = f[k-3] + f[k-4]，即在f[k-2]前面继续查找k-=2
                k-=2;
            }else {
                if (mid < heigh){
                    return mid;
                }else {
                    return heigh;
                }
            }
        }
        return -1;
    }
}
