package com.learnjava;
/*
    do...while语句
 */
public class DoWhile {
    public static void main(String[] args){
       //for循环实现
        for(int i=1;i<=5;i++){
            System.out.println("Hello Java!");
        }
        System.out.println("--------");

        //do...while循环实现
        int j=1;
        do {
            System.out.println("Hello Java!");
            j++;
        }while (j<=5);
    }
}
