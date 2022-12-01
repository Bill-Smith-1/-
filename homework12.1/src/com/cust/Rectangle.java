package com.cust;
/*3、设计一个二维矩形类Rectangle继承自Graph，该类中有成员变量长x和宽y，至少两个构造函数（无参和有参）；*/
public class Rectangle extends Graph{
    float x;
    float y;
    Rectangle(){
        dimension=2;
        x=10;
        y=10;
    }
    Rectangle(float x,float y){
        dimension=2;
        this.x=x;
        this.y=y;
    }
    float computeArea(){
        float area;
        area=x*y;
        return area;
    }
}
