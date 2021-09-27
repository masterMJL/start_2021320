package com.atguigu.recursion;

public class MiGong {
    public static void main(String[] args) {
        // 定义二维数组
        int[][] map = new int[8][7];

        // 添加上下挡板
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        // 添加左右挡板
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        // 添加特数当版
        map[3][1] = 1;
        map[3][2] = 1;

        // 输出
        System.out.println("地图：");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        setWay(map,1,1);
        System.out.println("新地图：");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 使用递归回溯给小球找最短路径i开始   j结束   map地图
    // 如果是map[6][5]说明该位置已经通
    // 约定map中 1 为墙  2为通路可以走  3为该点已经走过，走不通
    // 定义策略  上--右---下--左
    public static boolean setWay(int[][] map,int i,int j){
        if (map[6][5] == 2){
            return true;
        }else {
            if (map[i][j] ==0){// 没走过，按策略走
                map[i][j] = 2;// 假设能走通
                if (setWay(map,i+1,j)){// 下
                    return true;
                }else if (setWay(map,i,j+1)){// 右
                    return true;
                }else if (setWay(map,i-1,j)){// 上
                    return true;
                }else if (setWay(map,i,j-1)){// 左
                    return true;
                }else {
                    map[i][j] = 3;// 走不通
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}
