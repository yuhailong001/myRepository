package com.bjpowernode.arraytest;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        int data[] = {53,436,32,84,9,17,346};
        sortArray2(data);
    }

    public static void sortArray(int[] data){

        for(int i = 0; i < data.length - 1; i++){

            for(int j = 0; j < data.length - 1; j++){
                if(data[j+1] - data[j] < 0){
                    int n = data[j+1];
                    data[j+1] = data[j];
                    data[j] = n;
                }

            }
            System.out.println(Arrays.toString(data));
        }

    }

    public static void sortArray2(int[] data){

        for(int j = 0; j < data.length - 1; j++) {
            int min = j;
            for (int i = min + 1; i < data.length; i++) {
                if (data[i] < data[min]) {
                    min = i;
                }
            }
            if (min != j) {
                int n = data[min];
                data[min] = data[j];
                data[j] = n;
            }
            System.out.println(Arrays.toString(data));
        }

    }

    //二分查找
    

}
