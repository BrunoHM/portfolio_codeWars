package main.kyu_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Bananas {
    //Kata: https://www.codewars.com/kata/5917fbed9f4056205a00001e
    public static void main(String[] args) {

        System.out.println(bananas("bbananana"));

    }

    static Set<String> bananas(final String s) {
        List<String> resultList = new ArrayList<>();

        for (int index = 0; index < s.length(); index++) {
            resultList.addAll(baseLoopLogic(new ArrayList<>(), "", 0, s, s));
        }
        resultList = resultList.stream().distinct().collect(Collectors.toList());
        return new HashSet<>(resultList);
    }

    public static List<String> baseLoopLogic(List<String> resultList, String currentString, int indexToFulfill, String currentWord, String initialWord) {

        for (int indexLetter = 0; indexLetter < 2; indexLetter++) {
            if(indexLetter == 0){
                fieldFulfill2(resultList, currentString, indexToFulfill, true, currentWord, initialWord);
            }else{
                fieldFulfill2(resultList, currentString, indexToFulfill, false, currentWord, initialWord);
            }
        }

        return resultList;
    }

    public static void fieldFulfill2(List<String> resultList, String currentString, int indexToFulfill, boolean getLetter, String currentWord, String initialWord) {
        if(!currentWord.equals("")) {
            String currentLetter = currentWord.substring(0, 1).toLowerCase();
            currentWord = currentWord.substring(1);

            if (!getLetter) {
                currentString += "-";
            } else {
                currentString += currentLetter;
            }

            if (currentString.length() == initialWord.length()
                    && currentString.replace("-", "").equals("banana")
                    && !resultList.contains(currentString)) {
                resultList.add(currentString);
            }

            indexToFulfill++;
            baseLoopLogic(resultList, currentString, indexToFulfill, currentWord, initialWord);
        }
    }
}


