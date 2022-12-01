package com.cust.software;

public class GCDException extends Exception{
    int a,b;
    public GCDException(int a, int b){
        this.a=a;
        this.b=b;
    }
    public String toString() {
        return "MyException{" + "GCDException" + '}';
    }
}
