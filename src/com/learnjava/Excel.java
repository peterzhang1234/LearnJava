package com.learnjava;

public class Excel {
    public  static void main(String[] args){
        int n=1,sum;
        while (n<=9){
            int i=1;
            while (i<=n){
                sum = i*n;
                System.out.println(i + "*" +n + "=" +sum);
                i++;
            }
            System.out.println("--------");
            n++;
        }
    }
}
