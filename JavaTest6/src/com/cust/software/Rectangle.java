package com.cust.software;

import java.util.Scanner;

public class Rectangle extends TwoDimensional{
    float width;
    float height;
    void ConditionInfo(){
        System.out.println("请输入矩形的宽");
        Scanner Sw=new Scanner(System.in);
        String Swidth=Sw.next();
        width=Float.parseFloat(Swidth);
        System.out.println("请输入矩形的长");
        Scanner Sh=new Scanner(System.in);
        String Sheight=Sw.next();
        height=Float.parseFloat(Sheight);
    }
    void AreaGet(){
        ConditionInfo();
        area=width*height;
        System.out.println("矩形的面积为:"+String.format("%.2f",area));
    }
}
