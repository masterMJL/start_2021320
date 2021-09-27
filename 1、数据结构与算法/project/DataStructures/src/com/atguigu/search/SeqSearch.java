package com.atguigu.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: DataStructures
 * @Package: com.atguigu.search
 * @ClassName: SeqSearch
 * @author: mengjianglong
 * @description: 线性查找
 * @date: 2021/4/6 21:59
 * @version: 1.0
 */
public class SeqSearch {
    public static void main(String[] args) {
        int[] arr = {-1,88,5,4,11,0,11};

        List<Integer> list = seq(arr,11);

        for (int i:
             list) {
            System.out.print(i+"   ");
        }
    }
    public static List<Integer> seq(int[] arr,int value){
        List<Integer> list = new ArrayList<>();
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == value){
                list.add(a);
            }
        }
        return list;
    }
}
