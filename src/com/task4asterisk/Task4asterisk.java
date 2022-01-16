package com.task4asterisk;

import java.util.Arrays;

public class Task4asterisk {


    String insertAll (String initialText, String[] toInsert, int[] indexes) {
        Arrays.sort(indexes);

        StringBuilder stringBuilder = new StringBuilder(initialText);
        for (int i = 0; i < toInsert.length; i++) {
           if(i>0) {
               int a = toInsert[i-1].length();
                indexes[i]+=a;

            stringBuilder = stringBuilder.insert(indexes[i], toInsert[i]);
           }
           else {
               stringBuilder = stringBuilder.insert(indexes[i], toInsert[i]);
           }

        }
        System.out.println(stringBuilder);
        return null;
    }
    }

