package com.learnjava;
/*
    纸张折叠厚度与珠穆朗玛峰
 */
public class WhileTest01 {
    public static void main(String[] args){
        int count=0,h=8844430;
        double paper=0.1;
        while (paper<=h){
            paper*=2;
            count++;
        }
        System.out.println("只需要折叠"+ count +"次");
    }
}
