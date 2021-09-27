package com.atguigu.stack;

public class ArrayStackDemo {
    public static void main(String[] args) {

    }
}
class ArrayStack{
    private int maxSize;// 栈的最大值
    private int top = -1;// 栈顶,初始-1
    private int[] stack;// 栈

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[this.maxSize];
    }

    // 栈满
    public boolean full(){
        return top == maxSize-1;
    }

    // 栈空
    public boolean empty(){
        return top == -1;
    }

    // 入栈
    public void entry(int value){
        if (full()){
            throw new RuntimeException("栈满....");
        }
        top++;
        stack[top] = value;
    }

    // 出栈
    public int leave(){
        if (empty()){
            throw new RuntimeException("栈空....");
        }
        int value = stack[top];
        top--;
        return value;
    }

    // 遍历
    public void list(){
        if (empty()){
            throw new RuntimeException("栈空....");
        }
        for (int i = top;i >=0;i--){
            System.out.printf("stack[%d]=%d\n",i,stack[i]);
        }
    }
}
