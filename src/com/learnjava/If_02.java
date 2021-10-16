package com.learnjava;
/*
    if语句格式：
    格式：
        if(关系表达式){
            语句体1;
        }
        else {
            语句体2;
        }

    执行流程：
        1、首先计算关系表达式的值
        2、如果关系表达式的值true就执行语句体1
        3、如果关系表达式的值为false就执行语句体2
        4、继续执行后面的语句
 */
public class If_02 {
    public static void main(String[] args){
        System.out.println("开始");

        //定义两个个变量
        int a = 10;
        int b = 20;

        //判断是否大于，如果是，在控制台输出：a的值大于b，如果不是，在控制台输出：a的值不大于b
        if(a>b){
            System.out.println("a的值大于b");
        } else {
            System.out.println("a的值不大于b");
        }
        System.out.println("结束");
    }
}
