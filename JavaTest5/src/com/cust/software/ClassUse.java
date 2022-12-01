package com.cust.software;

import java.util.Scanner;

public class ClassUse {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        int num;
        num=1;
        c1.PointInfo(num);
        c1.RadiusInfo(num);
        num=2;
        c2.PointInfo(num);
        c2.RadiusInfo(num);
        int value1= Math.abs(c1.PointX-c2.PointX);
        int value2= Math.abs(c1.PointY-c2.PointY);
        double value=Math.sqrt(value1*value1+value2*value2);
        if(c1.r+c2.r<=value){
            System.out.println("两个圆不相交");
        }
        else if (value<c1.r) {
            System.out.println("第二个圆在第一个圆内");
        }
        else if(c1.PointX== c2.PointX&&c2.PointY== c2.PointY){
            System.out.println("两个圆重叠");
        }
    }


}

