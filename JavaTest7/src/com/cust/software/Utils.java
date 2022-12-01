package com.cust.software;

public class Utils {
    int IsPerNum(int a) {
        int[] array = new int[100000];
        int num = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                array[i - 2] = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            num += array[i];
        }
        return num;
    }
    void ComputerGDC(int a,int b) throws GCDException {
        int num=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                num=i;
            }
        }
        if(num==1){
            throw new GCDException(a,b);
        }
        System.out.println("最大公约数是"+num);
    }
    int minNum(int a,int b){
        if(a<b) return a;
        if(a>b) return b;
        else return a;
    }
}
