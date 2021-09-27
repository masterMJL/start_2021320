package com.atguigu.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: DataStructures
 * @Package: com.atguigu.search
 * @ClassName: BinarySearch
 * @author: mengjianglong
 * @description: 二分法查找
 * @date: 2021/4/6 22:39
 * @version: 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,1,3,45,88,856,856,856,1458};
        List<Integer> list = binary2(arr,0,arr.length-1,856);
        System.out.println(list);
    }
    public static int binary(int[] arr,int left ,int right,int findVal){
        int mid = (left+right)/2;
        int midVal = arr[mid];

        if (left>right){// 查找不到
            return -1;
        }

        if (findVal > midVal){// 向右递归
            return binary(arr,mid+1,right,findVal);
        }else if(findVal < midVal){// 向左递归
            return binary(arr,left,mid-1,findVal);
        }else {
            return mid;
        }
    }

    /**
     * 出现重复值时
     * @param arr
     * @param left
     * @param right
     * @param findVal
     * @return
     */
    public static List<Integer> binary2(int[] arr,int left ,int right,int findVal){
        int mid = (left+right)/2;
        int midVal = arr[mid];

        if (left>right){// 查找不到
            return new ArrayList<>();
        }

        if (findVal > midVal){// 向右递归
            return binary2(arr,mid+1,right,findVal);
        }else if(findVal < midVal){// 向左递归
            return binary2(arr,left,mid-1,findVal);
        }else {
            List<Integer> list = new ArrayList<>();

            int temp = mid-1;
            while (true){// 向左扫
                if (temp < 0 || arr[temp] != findVal){
                    break;
                }

                // 如果不满足退出条件时就将该下标加入集合中，，索引位置继续向左移动
                list.add(temp);
                temp -= 1;
            }

            list.add(mid);
            temp = mid + 1;
            while (true){// 向右扫
                if (temp > arr.length-1 || arr[temp] != findVal){
                    break;
                }

                // 如果不满足退出条件时就将该下标加入集合中，，索引位置继续向右移动
                list.add(temp);
                temp += 1;
            }
            return list;
        }
    }
}
