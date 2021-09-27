package com.atguigu.tree;

/**
 * 二叉树遍历
 * @author 25283
 * @version 1.0
 * @description: TODO
 * @date 2021/4/12 23:35
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Node root = new Node(1,"小明");
        Node node2 = new Node(2,"小云");
        Node node3 = new Node(3,"小彭");
        Node node4 = new Node(4,"小花");
        Node node5 = new Node(5,"关胜");

        root.setLeft(node2);
        root.setRight(node3);
        node3.setRight(node4);
        node3.setLeft(node5);
        tree.setRoot(root);

        System.out.println("前序遍历：");
        tree.preOrder();
        System.out.println("中序遍历：");
        tree.infixOrder();
        System.out.println("后序遍历：");
        tree.postOrder();

        System.out.println("前序查找：");
        Node node = tree.preFind(5);
        System.out.println(node);
    }
}
// 创建一个二叉树
class BinaryTree{
    private Node root;// 根节点

    public void setRoot(Node root) {
        this.root = root;
    }

    // 前序遍历
    public void preOrder(){
        if (this.root != null){
            this.root.preOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    public Node preFind(int no){
        if (this.root != null){
            return root.preFind(no);
        }else {
            return null;
        }
    }
    // 中序遍历
    public void infixOrder(){
        if (this.root != null){
            this.root.indexOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    public Node infixFind(int no){
        if (this.root != null){
            return root.infixFind(no);
        }else {
            return null;
        }
    }
    // 后序遍历
    public void postOrder(){
        if (this.root != null){
            this.root.postOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    public Node postFind(int no){
        if (this.root != null){
            return root.postFind(no);
        }else {
            return null;
        }
    }
}
class Node{
    private int no;
    private String name;
    private Node left;// 左子节点
    private Node right;// 右子节点

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 前序遍历
     */
    public void preOrder(){
        // 先输出根节点
        System.out.println(this);
        if (this.left != null){// 遍历左子节点
            this.left.preOrder();
        }
        if (this.right != null){// 遍历右子节点
            this.right.preOrder();
        }
    }

    /**
     * 中序遍历
     */
    public void indexOrder(){
        if (this.left != null){// 遍历左子节点
            this.left.indexOrder();
        }
        // 输出根节点
        System.out.println(this);
        if (this.right != null){// 遍历右子节点
            this.right.indexOrder();
        }
    }

    /**
     * 后序遍历
     */
    public void postOrder(){
        if (this.left != null){// 遍历左子节点
            this.left.postOrder();
        }
        if (this.right != null){// 遍历右子节点
            this.right.postOrder();
        }
        // 输出根节点
        System.out.println(this);
    }

    /**
     * 前序查找
     */
    public Node preFind(int no){
        if (this.no == no){
            return this;
        }

        Node node = null;
        if (this.left != null){
            node = this.left.preFind(no);
        }
        if (node != null){
            return node;
        }

        if (this.right != null){
            node = this.right.preFind(no);
        }
        return node;
    }

    /**
     * 中序查找
     */
    public Node infixFind(int no){

        Node node = null;
        if (this.left != null){
            node = this.left.infixFind(no);
        }

        if (node != null){
            return node;
        }

        if (this.no == no){
            return this;
        }

        if (this.right != null){
            this.right.infixFind(no);
        }
        return node;
    }

    /**
     * hou序查找
     */
    public Node postFind(int no){
        Node node = null;
        // 比较左子节点节点
        if (this.left != null){
            node = this.left.postFind(no);
        }
        if (node != null){
            return node;
        }
// 比较柚子节点
        if (this.right != null){
            node = this.right.postFind(no);
        }
        if (node != null){
            return node;
        }
        // 比较当前节点
        if (this.no == no){
            return this;
        }

        return node;
    }
}