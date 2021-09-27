package com.atguigu.hashtab;

import java.util.Scanner;

/**
 * @ProjectName: DataStructures
 * @Package: com.atguigu.hashtab
 * @ClassName: HashDemo
 * @author: mengjianglong
 * @description: 散列实现缓存
 * @date: 2021/4/7 21:44
 * @version: 1.0
 */
public class HashDemo {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab(7);
        Scanner sc = new Scanner(System.in);
        String key = "";
        while (true){
            System.out.println("add: 添加");
            System.out.println("list: 遍历");
            System.out.println("find: 查询");
            System.out.println("del: 删除");
            System.out.println("exit: 退出");
            key = sc.next();

            switch (key){
                case "add":
                    System.out.println("请输入雇员id：");
                    int id = sc.nextInt();
                    System.out.println("输入名字：");
                    String name = sc.next();
                    Emp emp = new Emp(id,name);
                    hashTab.add(emp);
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "find":
                    System.out.println("请输入要查询的雇员id：");
                    id = sc.nextInt();
                    hashTab.find(id);
                    break;
                case "del":
                    System.out.println("请输入要删除的雇员id：");
                    id = sc.nextInt();
                    hashTab.del(id);
                    break;
                case "exit":
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}

class HashTab {
    private EmpLinkedList[] empLinkedLists;
    private static int size;// 链表的长度

    public HashTab(int size) {
        this.empLinkedLists = new EmpLinkedList[size];
        this.size = size;
        for (int i = 0; i < size; i++) {// 初始化每一个链表
            empLinkedLists[i] = new EmpLinkedList();
        }
    }

    // 添加
    public void add(Emp emp) {
        int empLinkedListNo = empId(emp.id);
        empLinkedLists[empLinkedListNo].add(emp);
    }

    public static int empId(int id) {// 计算属于那个链表
        return id % size;
    }

    // 遍历
    public void list(){
        for (int i = 0; i < size; i++) {
            empLinkedLists[i].list(i);
        }
    }

    // 查询
    public void find(int id){
        int empLinkedListNo = empId(id);
        Emp emp = empLinkedLists[empLinkedListNo].find(id);
        if (emp !=null){
            System.out.println("找到了id = "+id);
        }else {
            System.out.println("未找到");
        }
    }

    // 删除
    public void del(int id){
        int empLinkedListNo = empId(id);
        empLinkedLists[empLinkedListNo].del(id);
    }
}

class Emp { // 储存的实体对象
    public int id;
    public String name;
    public Emp next; // 指向下一个emp

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class EmpLinkedList {
    // 定义头，指向第一个emp
    public Emp head;

    /**
     * 插入时，假设id由大到小，因此直接将其插入到最后面
     *
     * @param emp
     */
    public void add(Emp emp) {
        if (head == null) {
            head = emp;
            return;
        }

        // 如果不是第一个雇员吧
        Emp curEmp = head;
        while (true) {
            if (curEmp.next == null) {//找到退出
                break;
            }
            curEmp = curEmp.next;// 后移
        }
        curEmp.next = emp;
    }

    public void list(int no) {
        if (head == null) {
            System.out.println("第"+(no+1)+"链表为null");
            return;
        }

        System.out.println("第"+(no+1)+"链表为:");
        Emp curEmp = head;
        while (true) {
            System.out.println("id = " + curEmp.id + ",name = " + curEmp.name);
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
    }

    /**
     * 查询
     * @param id
     * @return
     */
    public Emp find(int id){
        if (head == null){
            System.out.println("链表为null");
            return null;
        }

        Emp curEmp = head;
        while (true){
            if (curEmp.id == id){
                break;
            }

            if (curEmp.next == null){
                curEmp = null;
                break;
            }
            curEmp = curEmp.next;
        }
        return curEmp;
    }

    /**
     * 删除
     * @param id
     */
    public void del(int id){
        if (head == null){
            System.out.println("链表为null，无法删除");
            return;
        }

        Emp curEmp = head;
        boolean flag = false;// 是否找到删除节点
        while (true){
            if (curEmp.id == id){// 找到节点
                flag = true;
                break;
            }
            if (curEmp.next == null){// 没找到节点
                break;
            }
            curEmp = curEmp.next;
        }

        if (flag){
            curEmp.next = curEmp.next.next;
        }else {
            System.out.println("节点不存在...");
        }
    }
}