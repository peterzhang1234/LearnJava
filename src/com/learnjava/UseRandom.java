package com.learnjava;
/*
    Random
    作用：
        用于产生一个随机数
     使用步骤：
        1、导包
            import  java.util.Random;
        2、创建对象
            Random r = new Random();
        3、获取随机数
            int number = r.nextInt(10);
            获取数据范围：[0,10) 包括0不包括10
 */

import  java.util.Random;

public class UseRandom {
    public static void main(String[] args) {
       //创建对象
       Random r = new Random();

       //用循环获取10个随机数
        for (int i=0;i<10;i++) {
            //获取随机数
            int number = r.nextInt(10);
            System.out.println("number:"+number);
        }

        //获取一个1-100之间的随机数
        int x = r.nextInt(100)+1;
        System.out.println("x:"+x);
    }
}
