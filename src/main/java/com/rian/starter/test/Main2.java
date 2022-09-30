package com.rian.starter.test;

public class Main2 {

    public static void main(String[] args) {
        String test = "My first arg 123456! test asdasd1";
        String[] words = test.split(" ");

        String maxWord = "";
        String strValue;
        for(int i = 0; i<words.length; i+=1){
            strValue = words[i].replaceAll("[^A-Za-z0-9]", "");
            if(maxWord.length() < strValue.length()){
                maxWord = strValue;
            }
        }
        System.out.println(maxWord);
    }
}
