package com.rian.starter.test;

import java.util.Locale;

public class Main {

    public static void main(String[] args)  {

        String str = "hello*3";
        String challengeToken = "unvo16kxc5";

        str = str.toLowerCase();
        int idx = 0;
        char charValue;
        String strValue;
        String outputValue = "";
        String finalOutputValue = "";

        while(idx < str.length()){
            charValue = str.charAt(idx);
            strValue = String.valueOf(str.charAt(idx));

            if(strValue.matches("[a-zA-Z]+")){
                if(charValue == 'z'){
                    charValue = 'a';
                }else{
                    charValue += 1;
                }

                if(charValue == 'a' || charValue == 'e' || charValue == 'i' || charValue == 'o' || charValue == 'u' ){
                    outputValue += String.valueOf(charValue).toUpperCase();
                }else{
                    outputValue += String.valueOf(charValue);
                }
            }else{
                outputValue += String.valueOf(charValue);
            }

            idx += 1;
        }

        idx = 0;
        if(outputValue.length() < challengeToken.length()){

            while(idx < outputValue.length()){
                charValue = outputValue.charAt(idx);
                finalOutputValue += charValue+""+challengeToken.charAt(idx);
                idx += 1;
            }
            finalOutputValue += challengeToken.substring(outputValue.length());
        }else{
            while(idx < challengeToken.length()){
                charValue = outputValue.charAt(idx);
                finalOutputValue += charValue+""+challengeToken.charAt(idx);
                idx += 1;
            }
            finalOutputValue += outputValue.substring(challengeToken.length());
        }
        System.out.println(finalOutputValue);
    }
}
