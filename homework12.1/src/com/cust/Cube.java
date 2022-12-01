package com.cust;
/*4、设计一个三维立方体类Cube继承自Graph，并实现IDimension接口，该类中有成员变量 长x，宽y，高z，至少两个构造函数*/
public class Cube extends Graph implements IDimension{
    float x;
    float y;
    float z;
    Cube(){
        dimension=3;
        x=10;
        y=10;
        z=10;
    }
    Cube(float x,float y,float z){
        dimension=3;
        this.x=x;
        this.y=y;
        this.z=z;
    }
    @Override
    public float computeVolume() {
        float area;
        area=x*y*z;
        return area;
    }
    float computeArea(){
        float area=0;
        area=(x*y+x*z+y*z)*2;
        return area;
    }
}
