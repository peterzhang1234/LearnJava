package com.learnjava;
/*
    循环嵌套
    控制台输出一天的小时和分钟
 */
public class For_For {
    public static void main(String[] args) {
        //外循环控制小时的范围，内循环控制分钟的范围
        for(int hour=0;hour<24;hour++){
            for(int minute=0;minute<60;minute++){
                System.out.println(hour+"时"+minute+"分");
            }
            System.out.println("--------");
        }
    }

}
