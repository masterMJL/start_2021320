package com.atguigu.recursion;

public class RecursionTest {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    // 第一个递归调用
    public static void test(int n){
        if (n>2){
            test(n-1);
        }
        System.out.println("n="+n);
    }

    // 数的阶乘
    public static int factorial(int n){
        if (n==1){
            return 1;
        }else {
            return factorial(n-1)*n;
        }
    }
}
