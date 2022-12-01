package com.cust;

public class Array {
    int[] data;
    int size=0;
    //默认大小
    public Array(int Size) {
        this.data = new int[Size];
    }
    public void ArraySetInfo(int a){
        if(size==0){
            data[0]=a;
            size++;
        }
        else{
            data[size]=a;
            size++;
        }
    }
    public void grow(){
        int[] newdata=new int[data.length];
        for(int i=0;i<data.length;i++){
            newdata[i]=data[i];
        }
        this.data=new int[(newdata.length)*2];
        for(int i=0;i<newdata.length;i++){
            this.data[i]=newdata[i];
        }
    }

    void add(int a/*插入的树脂*/,int b/*插入的元素位置*/){
        if(b<0&&b>size){
            System.out.println("输入的位置无效");
            return;
        }
        int[] vararray =new int[size-b];
        int num=0;
        for(int i=b;(size-i)>0;i++){
            vararray[num]=data[i];
            num++;
        }
        grow();
        data[b]=a;
        int ii=b;
        for (int i=0;i<vararray.length;i++){
            data[ii+1]=vararray[i];
            ii++;
        }
        size++;
        return;
    }
    void modify(int num,int index){
        if(index<0&&index>size){
            System.out.println("输入的位置无效");
            return;
        }
        data[index]=num;
    }
    void delete(int index){
        if(index<0&&index>size){
            System.out.println("输入的位置无效");
            return;
        }
        int[] deleted=new int[size-index];
        int ii1=0;
        int ii2=index;
        for (int i=index;size-i>0;i++){
            deleted[ii1]=data[i];
            ii1++;
        }
        for(int i=0;i<deleted.length;i++){
            data[ii2-1]=deleted[i];
            ii2++;
        }
        size--;
    }
    int query(int num){
        int requery=0;
        for(int i=0;i<size;i++){
            if(num==data[i]){
                requery=1;
            }
        }
        return requery;
    }
    public void Show(){
        System.out.println("数组的内容为：");
        for (int i=0;i<size;i++){
            System.out.println(data[i]);
        }
    }
}
