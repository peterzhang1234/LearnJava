package com.learnjava;
/*
    考试奖励
 */

import  java.util.Scanner;

public class IfTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = sc.nextInt();

        /*
        if(score>=95 && score<=100){
            System.out.println("山地自行车");
        } else if(score>=90 && score<=94){
            System.out.println("游乐场");
        } else if(score>=80 && score<=89){
            System.out.println("变形金刚");
        } else {
            System.out.println("Nothing");
        }
         */

        //数据测试：正确数据、边界数据、错误数据
        if (score>100 || score<0){
            System.out.println("你输入的成绩有误！");
        } else if(score>=95 && score<=100){
            System.out.println("山地自行车");
        } else if(score>=90 && score<=94){
            System.out.println("游乐场");
        } else if(score>=80 && score<=89){
            System.out.println("变形金刚");
        } else {
            System.out.println("Nothing");
        }
    }
}
