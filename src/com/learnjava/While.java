package com.learnjava;
/*
    while语句
 */
public class While {
    public static void main(String[] args){
        //输出5次"Hello Java!"
        for(int i=1;i<=5;i++){
            System.out.println("Hello Java!");
        }
        System.out.println("--------");
        int j=1;
        while (j<=5){
            System.out.println("Hello Java!");
            j++;
        }

    }
}
