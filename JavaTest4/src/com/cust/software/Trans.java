package com.cust.software;

import java.util.Scanner;

public class Trans {
    void MatrixTrans(){
        int[][] ArrayMatrix=new int[4][4];

        for(int i=0;i<3;i++){
            for(int o=0;o<4;o++) {
                Scanner Snum = new Scanner(System.in);
                String Num = Snum.next();
                int n = Integer.parseInt(Num);
                ArrayMatrix[i][o] = n;
            }
        }
        //写入
        System.out.println("原数组为：");
        for(int i=0;i<3;i++){
            for(int o=0;o<4;o++) {
                System.out.print(ArrayMatrix[i][o]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        //验证
        for(int i=0;i<4;i++){
            for(int o=0;o<4;o++) {
                int n=0;
                n=ArrayMatrix[i][o];
                ArrayMatrix[i][o]=ArrayMatrix[o][i];
                ArrayMatrix[o][i]=n;

            }
        }
        System.out.println("转置后的数组为：");
        for(int i=0;i<4;i++){
            for(int o=0;o<3;o++) {
                System.out.print(ArrayMatrix[o][i]+" ");
            }
                System.out.print("\n");
        }

    }
}
