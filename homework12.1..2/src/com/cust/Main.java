package com.cust;
/*已知有一个NXN的矩阵，
        要求：
        1、查找该矩阵中最大值的位置， 并输出该位置 (1分)
        2、求该矩阵的对角线之积，并输出该值  （2分）
        3、实现该矩阵的转置，并输出转置后的矩阵 （2分）*/
public class Main {
    public static void main(String[] args) {
        NXN nxn=new NXN();
        nxn.selectMax();
        nxn.sum_get();
        nxn.trans();
    }

}
