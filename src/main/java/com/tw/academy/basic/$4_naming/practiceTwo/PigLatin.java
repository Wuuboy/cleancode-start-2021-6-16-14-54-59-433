package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {
    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String str) {
        String[] marks={".",",","-",":",";","!","?"};
        String space = " ";
        String[] splitValuesBySpace = str.split(space);
        char firstChar;
        boolean flag = true;

        for (int i = 0; i < splitValuesBySpace.length; i++){
            for (String mark : marks)
                if (splitValuesBySpace[i].contains(mark)) {
                    flag = false;
                    break;
                }

            if (flag){
                firstChar = splitValuesBySpace[i].charAt(0);
                splitValuesBySpace[i] = splitValuesBySpace[i].substring(1);
                String AY = "ay";
                splitValuesBySpace[i] = splitValuesBySpace[i].replace(splitValuesBySpace[i], splitValuesBySpace[i] + firstChar + AY);
            }
            flag = true;
        }

        return String.join(space, splitValuesBySpace);
    }
}
