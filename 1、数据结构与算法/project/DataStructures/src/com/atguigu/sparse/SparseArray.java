package com.atguigu.sparse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author mjl88
 * @date 2021/2/28  20:31
 */
public class SparseArray {
    public static void main(String[] args) {
        // 创建原始二维数组11*11
        // 0：无棋子  1：黑子  2：白子
        int chessArray1[][] = new int[11][11];
        chessArray1[1][2] = 1;
        chessArray1[2][3] = 2;

        System.out.println("原始数组：");
        for (int[] row:chessArray1){

            for (int item:row){
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }

        // 将原始数组转化为稀疏数组
        int sum = 0;
        for (int i=0;i< chessArray1.length;i++){
            for (int j=0;j< chessArray1.length;j++){
                if (chessArray1[i][j] != 0){
                    sum++; // 得到有效数字
                }
            }

        }
        // 创建稀疏数组
        int sparseArr[][] = new int[sum+1][3];
        // 给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        // 遍历二维数组将有效值放入稀疏数组中
        int count = 0;
        for (int i=0;i< chessArray1.length;i++){
            for (int j=0;j< chessArray1.length;j++){
                if (chessArray1[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArray1[i][j];
                }
            }

        }

        // 输出稀疏数组
        System.out.println("稀疏数组为：");
        for (int i= 0;i<sparseArr.length;i++){
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }

        // 将稀疏数组保存至磁盘 E:\我的文档\架构师之路\1、数据结构与算法\map.data
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\"+"我的文档/架构师之路/1、数据结构与算法/map.data"));
            for (int[] row : sparseArr) {
                for (int item : row) {
                    bw.write(item);
                    bw.write("\t");
                }
                bw.write("\n");
            }
            bw.flush();
            bw.close();

            // 读取文件
            BufferedReader bf = new BufferedReader(new FileReader("E:\\"+"我的文档/架构师之路/1、数据结构与算法/map.data"));
            String row = bf.readLine();
            String[] s = new String(row).split("\t");
            int sparseArr1[][] = new int[Integer.parseInt(s[0])][Integer.parseInt(s[1])];
            while ((row = bf.readLine()) != null) {
                String[] s2 = new String(row).split("\t");
                sparseArr1[Integer.parseInt(s2[0])][Integer.parseInt(s2[1])] = Integer.parseInt(s2[2]);
            }
            bf.close();
            System.out.println("文件获取的数组：");
            for (int[] i:sparseArr1){

                for (int item:i){
                    System.out.printf("%d\t",item);
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        // 将稀疏数组---》二维数组
        int chessArray2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        // 取出有效值
        for (int i=1;i<sparseArr.length;i++){
            chessArray2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        System.out.println("还原后的数组：");
        for (int[] row:chessArray1){

            for (int item:row){
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }
    }
}
