package com.learnjava;
/*
    求和
 */
public class ForTest02 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i<=5;i++){
            sum+=i;  //sum = sum + i;
        }
        System.out.println("1-5之间的数据和是：" +sum);
    }
}
