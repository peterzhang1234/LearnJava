package com.learnjava;
/*
    逻辑运算符
 */
public class Operator07 {
    public static void main(String[] args){
        int i=10,j=20,k=30;

        //& 有false则false
        System.out.println((i>j)&(i>k));//false & false
        System.out.println((i<j)&(i>k));//ture & false
        System.out.println((i>j)&(i<k));//false & true
        System.out.println((i<j)&(i<k));//true & true
        System.out.println("--------");

        //| 有ture则true
        System.out.println((i>j)|(i>k));//false | false
        System.out.println((i<j)|(i>k));//ture | false
        System.out.println((i>j)|(i<k));//false | true
        System.out.println((i<j)|(i<k));//true | true
        System.out.println("--------");

        //^ 相同为false,不同为true
        System.out.println((i>j)^(i>k));//false ^ false
        System.out.println((i<j)^(i>k));//ture ^ false
        System.out.println((i>j)^(i<k));//false ^ true
        System.out.println((i<j)^(i<k));//true ^ true
        System.out.println("--------");

        //!
        System.out.println(i>j);
        System.out.println(!(i>j));
        System.out.println(!(!(i>j)));
    }
}
