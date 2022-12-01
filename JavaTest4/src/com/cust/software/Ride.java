package com.cust.software;

import java.util.Scanner;

public class Ride {
    int [][] Matrix1=new int[2][2];
    int [][] Matrix2=new int[2][2];
    int [][] MatrixEnding=new int[2][2];
    Ride(){
        for(int i=0;i<Matrix1.length;i++){
            for(int o=0;o<Matrix1[0].length;o++) {
                System.out.println("请输入第一个数组");
                Scanner Snum1=new Scanner(System.in);
                String Num= Snum1.next();
                int n = Integer.parseInt(Num);
                Matrix1[i][o]=n;
            }
        }
        for(int i=0;i<Matrix2.length;i++){
            for(int o=0;o<Matrix2[0].length;o++) {
                System.out.println("请输入第二个数组");
                Scanner Snum2=new Scanner(System.in);
                String Num= Snum2.next();
                int n = Integer.parseInt(Num);
                Matrix2[i][o]=n;
            }
        }

    }
    // ？
    void RideMatrix(){
        for(int i=0;i<MatrixEnding.length;i++){
            for(int o=0;o<MatrixEnding[0].length;o++) {
                //MatrixEnding[i][o]=Matrix1[]
            }
        }

    }
    void RidePointMatrix(){
        for(int i=0;i<MatrixEnding.length;i++){
            for(int o=0;o<MatrixEnding[0].length;o++) {
                MatrixEnding[i][o]=Matrix1[i][o]*Matrix2[i][o];
                System.out.print(MatrixEnding[i][o]+" ");
            }
                System.out.print("\n");
        }
    }
}
