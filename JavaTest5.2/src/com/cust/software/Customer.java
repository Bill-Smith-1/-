package com.cust.software;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Backstage account=new Backstage();
        int num=0;
        while (num!=9){
            System.out.println("输入1查看当前余额");
            System.out.println("输入2进行存款");
            System.out.println("输入3进行取款");
            System.out.println("输入9退出系统");
            Scanner Snum=new Scanner(System.in);
            String NumIn=Snum.next();
            num=Integer.parseInt(NumIn);
            if(num==1){
                account.MoneyShow();
            }
            else if(num==2){
                account.MoneyDeposit();
            }
            else if(num==3){
                account.MoneyTakeOut();
            }
            else if(num==9){
                return;
            }
            else {
                System.out.print("请输入正确的数字");
            }
        }
    }
}
