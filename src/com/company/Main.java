package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getIntger(5);
        int[] sorted=sortIntegers(myInteger);
        printArray(sorted);


    }

    public static int[] getIntger(int number) {
        System.out.println("Enter" + number + "integer.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = sn.nextInt();

        }
        return values;

    }
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println("Elements "+i+"content "+array[i]);
        }
    }
    public static int[] sortIntegers(int array[]){
        boolean flag=true;
        while(flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i + 1] > array[i]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag=true;
                }
            }
        }

    return array;

    }

}
