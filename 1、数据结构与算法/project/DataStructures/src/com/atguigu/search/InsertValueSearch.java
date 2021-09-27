package com.atguigu.search;

/**
 * @ProjectName: DataStructures
 * @Package: com.atguigu.search
 * @ClassName: InsertValueSearch
 * @author: mengjianglong
 * @description: 插值查找
 * @date: 2021/4/6 23:22
 * @version: 1.0
 */
public class InsertValueSearch {
    public static void main(String[] args) {
        int[] arr  = new int[100];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = i+1;
        }
        search1(arr,0,arr.length-1,100);
    }
    public static int search1(int[] arr,int left,int right,int findVal){
        // 当查找的值不存在时
        if (left > right || findVal < arr[0] || findVal > arr[arr.length-1]){
            return -1;
        }

        // 计算mid，自适应
        int mid = left + (right - left)*(findVal - arr[left])/(arr[right] - arr[left]);
        int midVal = arr[mid];

        if (findVal > midVal){// 向右递归
            return search1(arr,mid + 1,right,findVal);
        }else if (findVal < midVal) {// 向左递归
            return search1(arr,left,mid - 1,findVal);
        }else {
            return mid;
        }
    }
}
