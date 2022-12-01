package com.cust.software;

import java.util.Scanner;

public class Circle {
    int PointX,PointY;
    int r;
    void PointInfo(int num){
        System.out.println("请输入第"+num +"个圆的坐标");
        Scanner Sc1_coordinate = new Scanner(System.in);
        String c1_coordinate = Sc1_coordinate.next();
        String []nums1=c1_coordinate.split(",");
        int X=Integer.parseInt(nums1[0]);
        int Y=Integer.parseInt(nums1[1]);
        PointX=X;
        PointY=Y;
    }
    void RadiusInfo(int num){
        System.out.println("请输入第"+num +"个圆的半径");
        Scanner Sr=new Scanner(System.in);
        String Radius=Sr.next();
        r=Integer.parseInt(Radius);
    }

}
