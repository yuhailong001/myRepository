package com.bjpowernode.arraytest;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        int data[] = {53,436,32,84,9,17,346};
        System.out.println(binaryFindition(data, 2));
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
    public static int binaryFindition(int[] data, int count){

        Arrays.sort(data);

        int start = 0;
        int end = data.length;
        int mul = (start + end) / 2;

        while(start <= end){
            if(data[mul] == count){
                return count;
            }else if(data[mul] < count){
                start = mul + 1;
                mul = (start + end) / 2;
            }else{
                end = mul - 1;
                mul = (start + end) / 2;
            }

        }
        return -1;

    }

}
