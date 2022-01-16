package com.task4;

public class Main {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        String text = "initial string";
        String[] strArray = new String[2];
        strArray[0] = "first";
        strArray[1] = "9";

        int[] intArray = new int[2];
        intArray[0] = 2;
        intArray[1] = 4;

        task4.insertAll(text,strArray,intArray);
    }
}
