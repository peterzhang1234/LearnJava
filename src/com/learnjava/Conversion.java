package com.learnjava;
/*
    类型转换
 */
public class Conversion {
    public static void main(String[] arge){
        //自动转换类型
        double d=10;
        System.out.println(d);
        //定义byte类型的变量
        byte b=10;
        short s=b;
        int i=b;
        //chat c =b
        //类型不兼容

        //强制类型转换
        int k = (int)88.88;
        System.out.println(k);
    }
}
