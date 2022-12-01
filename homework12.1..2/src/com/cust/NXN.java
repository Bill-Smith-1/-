package com.cust;
/*已知有一个NXN的矩阵，
        要求：
        1、查找该矩阵中最大值的位置， 并输出该位置 (1分)
        2、求该矩阵的对角线之积，并输出该值  （2分）
        3、实现该矩阵的转置，并输出转置后的矩阵 （2分）*/
public class NXN {
    int[][] nxn=new int[5][5];
    int width_size;
    int height_size;
    NXN(){
        nxn= new int[][]{{11, 18, 27, 14, 22}, {25,34,19,26,44}, {51,12,79,56,66}, {48,44,107,57,77}, {28,96,99,4,70}};
        width_size=0;
        height_size=0;
        System.out.println("原数组为：");
        for(int i=0;i<5;i++){
            for(int o=0;o<5;o++) {
                System.out.print(nxn[i][o]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    void selectMax(){
        int num=0;
        for(int i=0;i<5;i++){
            for (int o=0;o<5;o++){
                if(num<nxn[i][o]){
                    num=nxn[i][o];
                    width_size=o;
                    height_size=i;
                }
            }

        }
        System.out.println("最大数的位置为：横坐标为"+(width_size+1)+"纵坐标为"+(height_size+1));
    }
    void sum_get(){
        int sum=0;
        for (int i=0;i<5;i++){
            sum+=nxn[i][i];
        }
        int o=0;
        for (int i=4;i>=0;i--){
            sum+=nxn[i][o];
            o++;
        }
        System.out.println("对角线和的大小为："+sum);
    }
    void trans(){
        for(int i=0;i<5;i++){
            for(int o=0;o<5;o++) {
                int n=0;
                n=nxn[i][o];
                nxn[i][o]=nxn[o][i];
                nxn[o][i]=n;
            }
        }
        System.out.println("转置后的数组为：");
        for(int i=0;i<5;i++){
            for(int o=0;o<5;o++) {
                System.out.print(nxn[o][i]+" ");
            }
            System.out.print("\n");
        }
    }
}
