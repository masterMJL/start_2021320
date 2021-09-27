package com.atguigu.recursion;

public class Queue8 {
    // 定义一个max=8
    int max = 8;
    int[] array = new int[max];
    public static void main(String[] args) {

    }

    // 放置皇后
    public void check(int n){
        if (n == max){// 放完
            print();
            return;
        }

        // 依次放入皇后
        for (int i = 0;i < max;i++){
           // 先把皇后n，放到改行第一列
            array[n]  = i;
            if (jude(n)){
                check(n+1);
            }
        }
    }

    // 检测皇后冲突
    public boolean jude(int n){
        for (int i = 0;i < n;i++){
            /**
             * array[i]==array[n]判断同列
             * Math.abs(n-i)==Math.abs(array[n]-array[i])判断是否在对角线
             */
            if (array[i]==array[n] || Math.abs(n-i)==Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;
    }
    // 输出皇后拜访位置
    public void print(){
        for (int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
