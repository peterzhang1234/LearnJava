package com.learnjava;
/*
    三种循环对比
 */
public class LoopTest {
    public static void main(String[] args){
        //for循环
        for(int i=3;i<3;i++){
            System.out.println("Hello Java!");
        }
        System.out.println("--------");

        //while循环
        int j=3;
        while (j<3){
            System.out.println("Hello Java!");
        }
        System.out.println("--------");

        //do...while循环
        int k=3;
        do {
            System.out.println("Hello Java!");
            k++;
        }while (k<3);
    }
}
