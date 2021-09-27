package com.atguigu.stack;

public class Calculator {
    public static void main(String[] args) {
        // 运算式
        String expression = "10+2*6-2";

        // 创建两个栈，数栈，符号栈
        ArrayStack2 numStack = new ArrayStack2(10);
        ArrayStack2 operStack = new ArrayStack2(10);

        // 定义相关变量
        int index = 0;// 索引
        int num1 = 0, num2 = 0, res = 0, oper = 0;
        char ch = ' ';//将每次扫到的结果保存到ch中
        String keep = "";// 多位数保存
        while (true) {
            // 依次得到expression
            ch = expression.substring(index, index + 1).charAt(0);

            // 判断ch是什么
            if (operStack.isOper(ch)) {
                // 判断符号栈是否为空
                if (!operStack.empty()) {
                    // 如果有操作符进行比较，如果当前操作符小于等于栈中的操作符，就需要从数栈中取出两个数。然后从符号栈中取出一个符号
                    // 计算完之后将结果入数栈，符号入符号栈
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        //
                        num1 = numStack.leave();
                        num2 = numStack.leave();
                        oper = operStack.leave();
                        res = numStack.cal(num1, num2, oper);

                        // 将运算结果入栈
                        numStack.entry(res);
                        // 将当前操作付入符号栈
                        operStack.entry(ch);
                    } else {
                        // 如果优先级大于栈顶
                        operStack.entry(ch);
                    }
                } else {
                    // 如果为空直接入栈
                    operStack.entry(ch);
                }
            } else {
                // 如果是数，则直接入数栈
                //numStack.entry(ch - 48);// ascll码

                // 处理多位数
                keep+=ch;
                if (index==expression.length()-1){
                    numStack.entry(Integer.parseInt(keep));
                }else {
                    // 判断下一个字符是不是数字
                    if (operStack.isOper(expression.substring(index+1,index+2).charAt(0))){
                        numStack.entry(Integer.parseInt(keep));
                        keep="";
                    }
                }
            }
            index++;
            if (index >= expression.length()) {
                break;
            }
        }
        // 当表达式扫描完毕
        while (true) {
            if (operStack.empty()) {
                break;
            }
                num1 = numStack.leave();
                num2 = numStack.leave();
                oper = operStack.leave();
                res = numStack.cal(num1, num2, oper);

                // 将运算结果入栈
                numStack.entry(res);

        }
        // 数栈最后的数取出来就是结果
        System.out.println(numStack.leave());
    }
}

class ArrayStack2 {
    private int maxSize;// 栈的最大值
    private int top = -1;// 栈顶,初始-1
    private int[] stack;// 栈

    public ArrayStack2(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[this.maxSize];
    }

    // 栈满
    public boolean full() {
        return top == maxSize - 1;
    }

    // 查看栈顶的值
    public int peek() {
        return stack[top];
    }

    // 栈空
    public boolean empty() {
        return top == -1;
    }

    // 入栈
    public void entry(int value) {
        if (full()) {
            throw new RuntimeException("栈满....");
        }
        top++;
        stack[top] = value;
    }

    // 出栈
    public int leave() {
        if (empty()) {
            throw new RuntimeException("栈空....");
        }
        int value = stack[top];
        top--;
        return value;
    }

    // 遍历
    public void list() {
        if (empty()) {
            throw new RuntimeException("栈空....");
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }

    // priority 运算符优先级
    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '-' || oper == '+') {
            return 0;
        } else {
            return -1;
        }
    }

    // 判断是不是运算符号
    public boolean isOper(char val) {
        if (val == '*' || val == '/' || val == '-' || val == '+') {
            return true;
        }
        return false;
    }

    // 计算
    public int cal(int num1, int num2, int oper) {
        int res = 0;// 及算结果
        switch (oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;
                break;
            default:
                break;
        }
        return res;
    }
}
