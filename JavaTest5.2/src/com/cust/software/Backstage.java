package com.cust.software;

import java.util.Scanner;

public class Backstage {
    private float money=0f;
    void MoneyShow(){
        System.out.println("您的余额还有"+money);
    }
    void MoneyDeposit(){
        System.out.println("请输入您要存款的金额");
        Scanner Smoney=new Scanner(System.in);
        String INmoney=Smoney.next();
        float m=Float.parseFloat(INmoney);
        money=money+m;
        System.out.println("存款成功！");
        System.out.println("您的余额为"+String.format("%2.2f",money));
    }
    void MoneyTakeOut(){
        System.out.println("请输入您要取出的金额");
        Scanner Smoney=new Scanner(System.in);
        String INmoney=Smoney.next();
        float m=Float.parseFloat(INmoney);
        if(m<=money) {
            money = money - m;
            System.out.println("取款成功！");
            System.out.println("您的余额为"+String.format("%2.2f",money));
        }
        else{
            System.out.println("您的余额不足！");
        }
    }
}
