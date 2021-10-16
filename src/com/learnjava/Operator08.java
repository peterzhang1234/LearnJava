package com.learnjava;
/*
    短路逻辑运算符
 */
public class Operator08 {
    public static void main(String[] args) {
        int i = 10, j = 20, k = 30;

        //&& 有false则false;当第一个语句为false，则后一判断语句不执行，短路效果
        System.out.println((i > j) && (i > k));//false & false
        System.out.println((i < j) && (i > k));//ture & false
        System.out.println((i > j) && (i < k));//false & true
        System.out.println((i < j) && (i < k));//true & true
        System.out.println("--------");

        //|| 有ture则true;当第一个语句为false，则后一判断语句不执行，短路效果
        System.out.println((i > j) || (i > k));//false | false
        System.out.println((i < j) || (i > k));//ture | false
        System.out.println((i > j) || (i < k));//false | true
        System.out.println((i < j) || (i < k));//true | true
        System.out.println("--------");

        //&&和&
       // System.out.println((i++ > 100) & (j++ > 100));//false & false
        System.out.println((i++ > 100) && (j++ > 100));//false && false
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
