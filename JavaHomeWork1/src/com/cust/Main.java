package com.cust;
//JavaHomeWork1

public class Main {
    static int num=1;
    public static void numplus(){
        num++;
    }
    public static void main(String[] args) {
        int number=0;
        int[] array=new int[100];
        array[0]=8;
        int[] newarray=new int[101];
        newarray[0]=8;
        for(int i=10;i<100;i++){
            if(i%10==8){
                array[num]=i;
                numplus();
                number++;
            }
        }
        for(int i=100;i<1000;i++) {
            if (i % 10 == 8) {
                array[num] = i;
                numplus();
                number++;
            }
        }

        System.out.println("一千以内8结尾的个数为"+number+"：");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }


        for(int i=0;i<array.length;i++){
            if(array[i]<100&&array[i]>10){
                int num1=array[i]%10;
                int num2=array[i]/10;
                newarray[i+1]=(num1*10)+num2;
            }
            if(array[i]<1000&&array[i]>100){
                int num1=array[i]%10;
                int num2=array[i]%100%10;
                int num3=array[i]/100;
                newarray[i+1]=(num1*100)+num2*10+num3;
            }
        }
        int add=0;
        for(int i=0;i<newarray.length;i++){

            add+=newarray[i];

        }
        System.out.println("所有逆序数的和为"+add);
    }
}
