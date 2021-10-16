package com.learnjava;
/*
    if语句格式：
    格式
        if (关系表达式){
            语句体；
        }
    执行流程：
        1、首先计算关系表达式的值
        2、如果关系表达式的值true就执行语句体
        3、如果关系表达式的值为false就不执行语句体
        4、继续执行后面的语句
 */

public class If_01 {
    public static void main(String[] args){
        System.out.println("开始");

        //定义两个变量
        int a =10,b = 20,c = 10;

        //判断a和b的值是否相等，如果相等，就在控制台输出：a等于b
        if(a==b){
            System.out.println("a等于b");
        }

        //判断a和c的值是否相等，如果相等，就在控制台输出：a等于c
        if(a==c){
            System.out.println("a等于c");
        }
        System.out.println("结束");
    }
}
