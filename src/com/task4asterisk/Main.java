package com.task4asterisk;

public class Main {
    public static void main(String[] args) {


    Task4asterisk task4a = new Task4asterisk();
        String text1 = "initial string";
        String[] strArray1 = new String[2];
        strArray1[0] = "first";
        strArray1[1] = "9";

        int[] intArray1 = new int[2];
        intArray1[0] = 2;
        intArray1[1] = 4;

        task4a.insertAll(text1,strArray1,intArray1);
}
}