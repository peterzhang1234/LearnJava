package com.learnjava;
/*
    三个和尚比体重
 */
public class OperatorTest02 {
    public static void main(String[] args){
        int height1 = 150,height2 = 210,height3 = 165;

        int tempHeight = height1 > height2 ? height1 : height2;

        int maxHeight = tempHeight > height3 ? tempHeight : height3;

        System.out.println("maxHeight: " + maxHeight);

    }
}
