package com.atguigu.queue;

/**
 * @author mjl88
 * @date 2021/3/1  20:01
 */
public class ArrayQueue {
    public static void main(String[] args) {

    }
}
// 使用数组模拟队列
class ArrQueue{
    private int maxSize;// 最大容量
    private int front;// 队列头部
    private int rear;// 队列尾部
    private int[] arr;// 存放数据，模拟队列

    public ArrQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        front = -1;// 初始化头部,指向头的迁移个位置
        rear = -1;// 初始化尾部，指向尾的前一个位置
        arr = new int[arrMaxSize];
    }

    // 判断队列是否满
    public boolean isFull(){
        return rear == maxSize-1;
    }
    // 判断是否为null
    public boolean isEmpty(){
        return rear == front;
    }

    // 添加数据到队列
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列已满。。。。");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    // 取出数据
    public int getQueue() {
        if (isEmpty()){
            throw new RuntimeException("队列为空.....");
        }
        front++;
        return arr[front];
    }

    // 遍历队列s
    public void getArr() {
        if (isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    // 取头信息
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列为空.....");
        }
        return arr[front+1];
    }
}