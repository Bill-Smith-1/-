package com.cust.software;

import java.util.Scanner;

public class Circle extends TwoDimensional{
    float r;
    void ConditionInfo(){
        System.out.println("请输入圆的半径");
        Scanner Sw=new Scanner(System.in);
        String Swidth=Sw.next();
        r=Float.parseFloat(Swidth);

    }
    void AreaGet(){
        ConditionInfo();
        area=r*r*Math.PI;
        System.out.println("圆的面积为:"+String.format("%.2f",area));
    }
}
