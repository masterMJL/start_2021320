package com.atguigu.tree;

/**
 * 顺序二叉树
 * @author 25283
 * @version 1.0
 * @description: TODO
 * @date 2021/4/14 22:32
 */
public class ArrBinaryTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ArrBinaryTree tree = new ArrBinaryTree(arr);
        tree.infixOrder(0);
    }
}
class ArrBinaryTree{
    private int[] arr;

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    /**
     * 前序遍历
     * @param index 下标
     */
    public void preOrder(int index){
        if (arr == null || arr.length == 0){
            System.out.println("数组为空，无法遍历");
        }

        System.out.println(arr[index]);
        if ((index*2+1) < arr.length){// 左遍历
            preOrder(index*2+1);
        }
        if ((index*2+2) < arr.length){// 有遍历
            preOrder(index*2+2);
        }
    }

    /**
     * 中序遍历
     * @param index 下标
     */
    public void infixOrder(int index){
        if (arr == null || arr.length == 0){
            System.out.println("数组为空，无法遍历");
        }

        if ((index*2+1) < arr.length){// 左遍历
            infixOrder(index*2+1);
        }
        System.out.println(arr[index]);

        if ((index*2+2) < arr.length){// you遍历
            infixOrder(index*2+2);
        }
    }

    /**
     * hou序遍历
     * @param index 下标
     */
    public void postOrder(int index){
        if (arr == null || arr.length == 0){
            System.out.println("数组为空，无法遍历");
        }

        if ((index*2+1) < arr.length){// 左遍历
            infixOrder(index*2+1);
        }
        if ((index*2+2) < arr.length){// you遍历
            infixOrder(index*2+2);
        }
        System.out.println(arr[index]);
    }
}
