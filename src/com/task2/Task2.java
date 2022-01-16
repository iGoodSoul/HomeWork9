package com.task2;

public class Task2 {
      String  getSequance(String text, char symbolStart, char symbolEnd){
         if (text.indexOf(symbolStart) <= -1 || text.lastIndexOf(symbolEnd) <= -1 ){
             return null;
         }else {
             int iStart = text.indexOf(symbolStart);
          int iEnd = text.lastIndexOf(symbolEnd);
   text = new StringBuilder(text).substring(iStart,iEnd+1);
          System.out.println(text);
          return text;
         }
    }
}
