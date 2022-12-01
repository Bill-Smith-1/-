package com.cust.soft;
import java.util.Scanner;

public class Reversal {
    String text1;
    char[] text;
    char[] NewText;
    void out() {
        System.out.println("请输入字符串");
        Scanner ScText=new Scanner(System.in);
        text1=ScText.next();
        text=text1.toCharArray();
        NewText=text1.toCharArray();
        int o=0;
        for(int i=(text.length-1);i>=0;i--){
            NewText[o]=text[i];
            o++;
        }
        for(int i=0;i<NewText.length;i++){
            System.out.println(NewText[i]);
        }
    }
}
