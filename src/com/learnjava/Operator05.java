package com.learnjava;
/*
    自增运算符
 */
public class Operator05 {
    public static void main(String[] args){
        //定义变量
        int i = 10;
        System.out.println("i:" +i);
        //i++;
       // System.out.println("i:" +i);

        //参与操作使用
        //int j = i++;
        int j = ++i;
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
