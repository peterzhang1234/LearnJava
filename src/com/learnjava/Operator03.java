package com.learnjava;
/*
    字符串"+"操作
 */
public class Operator03 {
    public static void main(String[] srgs){
        System.out.println("hello"+"java");
        System.out.println("hello"+ 123);
        System.out.println(123 + "java");

        System.out.println("java"+1+23);
        System.out.println(1+99+"年");
        //如果出现字符串，就是连接运算符，否则就是算术运算符；连续执行时，从左到右逐个执行
    }
}
