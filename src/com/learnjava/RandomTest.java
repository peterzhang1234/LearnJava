package com.learnjava;
/*
    猜数字
 */

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100)+1;
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数字：");
            int gussNumber = sc.nextInt();

            if (gussNumber > number) {
                System.out.println("你猜的数字" + gussNumber + "大了");
            } else if (gussNumber < number) {
                System.out.println("你猜的数字" + gussNumber + "小了");
            } else {
                System.out.println("恭喜你猜中了！");
                break;
            }
        }

    }
}
