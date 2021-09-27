package com.atguigu.queue;

/**
 * @author mjl88
 * @date 2021/3/7  11:05
 */
public class CircleArrayQueue {
    public static void main(String[] args) {
        System.out.println("sddddd");
    }

    // 使用数组模拟环形队列
    class ArrQueue {
        private int maxSize;// 最大容量
        private int front;// 队列头部
        private int rear;// 队列尾部
        private int[] arr;// 存放数据，模拟队列

        public ArrQueue(int arrMaxSize) {
            maxSize = arrMaxSize;
            front = 0;// 初始化头部,指向头的迁移个位置
            rear = 0;// 初始化尾部，指向尾的前一个位置
            arr = new int[maxSize];
        }

        // 判断队列是否满
        public boolean isFull() {
            return (rear + 1) % maxSize == front;
        }

        // 判断是否为null
        public boolean isEmpty() {
            return rear == front;
        }

        // 添加数据到队列
        public void addQueue(int n) {
            if (isFull()) {
                System.out.println("队列已满。。。。");
                return;
            }
            arr[rear] = n;
            rear = (rear + 1) % maxSize;
        }

        // 取出数据
        public int getQueue() {
            if (isEmpty()) {
                throw new RuntimeException("队列为空.....");
            }
            int value = arr[front];
            front = (front + 1) % maxSize;
            return value;
        }

        // 遍历队列s
        public void getArr() {
            if (isEmpty()) {
                System.out.println("队列为空");
                return;
            }
            for (int i = front; i < front + size(); i++) {
                System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
            }
        }

        // 求出当前队列有效数据个数
        public int size() {
            return (rear + maxSize - front) % maxSize;
        }

        // 取头信息
        public int headQueue(){
            if (isEmpty()){
                throw new RuntimeException("队列为空.....");
            }
            return arr[front];
        }
    }
}
