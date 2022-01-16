package com.task1;

import java.util.Arrays;

public class TextWorker {
    public static void isPalindrome(String word) {
        if (word.trim().equalsIgnoreCase((new StringBuilder(word)).reverse().toString().trim())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

  public static String[] findAllMails(String text){
        int count = 0;
       String[] strArray = text.split(" ");
    String[] emailArray = new String[strArray.length];
      int indexEmailArray = 0;
      for (int i = 0; i < strArray.length; i++) {
          if (strArray[i].endsWith(".com") ||strArray[i].endsWith(".net") || strArray[i].endsWith(".ru") ){
                 emailArray[indexEmailArray] = strArray[i];
              count++;
              indexEmailArray++;

              }
      }


     String[] finishArray = Arrays.copyOf(emailArray, count);


      System.out.println(Arrays.toString(finishArray));
       return finishArray;


      }
   }


