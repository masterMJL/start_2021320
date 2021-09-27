package com.atguigu.linkedlist;

/**
 * @author mjl88
 * @date 2021/3/11  19:24
 */
public class BothwayLinkedListDemo {
    public static void main(String[] args) {

    }
}
// 定义一个管理者 ，用来管理HeroNode
class BothwayLinkedList {
    // 创建头节点
    HeroNode1 head = new HeroNode1(0, "", "");

    // 获取单链表节点个数
    public static int getLength(HeroNode1 node) {
        if (node.next == null) {
            return 0;
        }
        int length = 0;
        HeroNode1 crr = node.next;
        while (crr != null) {
            length++;
            crr = crr.next;
        }
        return length;
    }

    // 查找链表中倒数第K各值
    public static HeroNode1 getLastHeroNode(HeroNode1 node,int index){
        // 如果链表为null
        if (node.next==null){
            return null;
        }
        int size = getLength(node);// 得到长度
        // 第二次遍历size-index位置，就是倒数第k各节点
        if (index<=0||index>size){
            return null;
        }
        HeroNode1 cur = node.next;
        for (int i =0;i<size-index;i++){
            cur = cur.next;
        }
        return cur;
    }
    // 删除节点
    public void delete(int no) {
        // 因为头节点不能动，我们需定义一个辅助变量temp
        HeroNode1 temp = head;

        if (head.next == null) {
            System.out.println("该链表为空...");
        }
        boolean flag = false;// 判断是否找到节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag == true) {
            temp.next = temp.next.next;
        } else {
            System.out.println("节点不存在...");
        }
    }

    // 修改节点
    public void update(HeroNode1 newNode) {
        // 因为头节点不能动，我们需定义一个辅助变量temp
        HeroNode1 temp = head;

        if (head.next == null) {
            System.out.println("该链表为空...");
        }

        boolean flag = false;// 判断是否找到节点
        while (true) {
            if (temp == null) {
                break;
            }
            if (newNode.no == temp.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag == true) {
            temp.name = newNode.name;
            temp.nickName = newNode.nickName;
        } else {
            System.out.println("未找到要修改的节点 " + newNode.no);
        }
    }

    // 加入一个节点
    public void add(HeroNode1 node) {
        // 因为头节点不能动，我们需定义一个辅助变量temp
        HeroNode1 temp = head;

        // 遍历找最后一个节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
        node.pre=temp;
    }

    // 按位插入
    public void add1(HeroNode1 node) {
        // 因为头节点不能动，我们需定义一个辅助变量temp
        HeroNode1 temp = head;

        boolean flag = false; // 判断节点是否存在
        while (true) {
            if (temp.next == null) {// 判断是否为最后一个节点
                break;
            }
            if (temp.next.no > head.no) {// 判断是否为当前要插入的位置
                break;
            } else if (temp.next.no == head.no) {// 节点已存在
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag == true) {
            System.out.println("该编号已经存在.." + node.no);
        } else {
            node.next = temp.next;
            temp.next = node.next;
        }
    }

    // 遍历链表
    public void list() {
        // 判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空...");
            return;
        }

        HeroNode1 temp = head.next;

        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}

// 定义一个HeroNode，每个HeroNode就是一个节点
class HeroNode1 {
    public int no;
    public String name;
    public String nickName;
    public HeroNode1 next;// next域，指向下一个节点
    public HeroNode1 pre;// pre域指向上一各节点

    // 构造器

    public HeroNode1(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    // 重写toString方法

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName +
                '}';
    }
}

