package com.task4;

public class Task4 {
    String insertAll (String initialText, String[] toInsert, int[] indexes){
        StringBuilder stringBuilder = new StringBuilder(initialText);
        for (int i = 0; i < toInsert.length ; i++) {

                stringBuilder= stringBuilder.insert(indexes[i],toInsert[i]);



        }
        System.out.println(stringBuilder);
        return null;
    }

}
