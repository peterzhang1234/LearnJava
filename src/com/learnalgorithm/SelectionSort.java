package com.learnalgorithm;

//选择排序

public class SelectionSort {
    public static  void main(String[] args){
        int[] arr = {5,3,6,8,1,7,9,4,2};
        for(int i=0; i<arr.length - 1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
//                if(arr[j]<arr[minPos])
//                    minPos = j;
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }

            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

            System.out.println("经过第" + i + "次循环，数组内容为：");
//            for(int k=0; k<arr.length; k++){
//                System.out.println(arr[k] + " ");
            print(arr);
            }
        //        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i] + " ");
        print(arr);
        }
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void swap(int[] arr, int i, int j){
        
    }
}
