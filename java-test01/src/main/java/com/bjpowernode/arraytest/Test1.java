package com.bjpowernode.arraytest;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        int data[] = {53,436,32,84,9,17,346};
        sortArray(data);
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

}
