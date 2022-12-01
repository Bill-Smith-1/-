package com.cust;
/*类的设计与实现
        1、设计一个图形抽象类Graph，该类中有成员变量图形类型（type），维度信息（dimension，二维或三维）；成员方法计算面积（computeArea）;
        2、设计一个接口IDimension，包括一个方法计算体积（computeVolume）;
        3、设计一个二维矩形类Rectangle继承自Graph，该类中有成员变量长x和宽y，至少两个构造函数（无参和有参）；
        4、设计一个三维立方体类Cube继承自Graph，并实现IDimension接口，该类中有成员变量 长x，宽y，高z，至少两个构造函数
        5、在main函数中进行如下测试：
        （1）创建一个矩形对象，并输出其面积；
        （2）创建一个立方体对象，并输出其表面积和体积*/
public class Main {
    public static void main(String[] args) {
        Graph rectangle=new Rectangle(10,15);
        System.out.println("矩形的面积是:"+rectangle.computeArea());
        Cube cube=new Cube(12,17,19);
        System.out.println("立方体的面积是:"+cube.computeVolume());
        System.out.println("立方体的体积是:"+cube.computeArea());
    }
}
