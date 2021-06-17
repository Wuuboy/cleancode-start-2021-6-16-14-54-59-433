package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {
    public static String decode(String input) {

        String moreThan2SpaceRegex = "\\s{2,}";
        String[] splitValuesBySpace = input.split(moreThan2SpaceRegex);
        StringBuilder decodedMorseCode = new StringBuilder();
        for (String splitValue : splitValuesBySpace) {
            String oneSpace = " ";
            String [] splitValuesByOneSpace = splitValue.split(oneSpace);
            for (String splitValueByOneSpace: splitValuesByOneSpace) {
                decodedMorseCode.append(MorseCode.get(splitValueByOneSpace));
            }
            decodedMorseCode.append(oneSpace);
        }
        String nullString = "null";
        String emptyString = "";
        return decodedMorseCode.toString().replaceAll(nullString, emptyString).trim();
    }
}
