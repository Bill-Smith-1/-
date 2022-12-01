package com.cust.software;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils u=new Utils();
        Scanner Snum=new Scanner(System.in);
        String Stext=Snum.next();
        int num=Integer.parseInt(Stext);
        if(num==(u.IsPerNum(num)+1)){
            System.out.println("您输入的是完全数");
        }
        else System.out.println("您输入的不是完全数");
        System.out.print("所有的完全数为：");
        for(int i=0;i<=10000;i++){
            if(i==(u.IsPerNum(i)+1)){
                System.out.print(i+"，");
            }
        }
        System.out.println(" ");
        System.out.println("请输入第一个最大公约数：");
        Scanner Snum01=new Scanner(System.in);
        String Stext01=Snum01.next();
        int num01=Integer.parseInt(Stext01);
        System.out.println("请输入第二个最大公约数：");
        Scanner Snum02=new Scanner(System.in);
        String Stext02=Snum02.next();
        int num02=Integer.parseInt(Stext02);
        try{
            u.ComputerGDC(num01,num02);
        }
        catch (Exception e){
            System.out.println("MyException->"+e);
        }
    }
}
