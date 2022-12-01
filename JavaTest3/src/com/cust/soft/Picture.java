package com.cust.soft;

import java.util.Scanner;

public class Picture {
    void PrintPic(){
        System.out.println("请输入整数");
        Scanner Snum=new Scanner(System.in);
        String num=Snum.next();
        int n = Integer.parseInt(num);
        for(int o=0;o<n;o++) {
            for(int i=(n-2);i>=o;i--){
                System.out.print(" ");
            }
            System.out.print(o+1);
            if(o!=0) {
                for(int p=2;p<=(o+1)*2-1;p++) {
                    System.out.print(" ");
                }
                System.out.print(o+1);
            }
            System.out.print("\n");
        }
        for(int o=n-2;o>=0;o--) {
            for(int i=(n-2);i>=o;i--){
                System.out.print(" ");
            }
            System.out.print(o+1);//next line num
            if(o!=0) {
                for(int p=2;p<=(o+1)*2-1;p++) {
                    System.out.print(" ");
                }
                System.out.print(o+1);
            }
            System.out.print("\n");
        }
    }
}
