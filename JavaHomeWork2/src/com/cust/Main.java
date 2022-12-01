package com.cust;

public class Main {

    public static void main(String[] args) {
        Array array =new Array(8);

        int[] member ={11,19,18,25,37,64,29,77};

        for (int i=0;i<8;i++){
            array.ArraySetInfo(member[i]);
        }
        array.Show();
        array.add(4,2);
        array.Show();
        array.delete(4);
        if(array.query(37)==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        array.Show();

    }

}
