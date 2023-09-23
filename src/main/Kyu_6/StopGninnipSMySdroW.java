package main.Kyu_6;

import java.util.List;

public class StopGninnipSMySdroW {
    public static void main(String[] args) {

        System.out.println(spinWords("This is a test").equals("This is a test"));
        System.out.println(spinWords("Welcome").equals("emocleW"));
        System.out.println(spinWords("Hey fellow warriors").equals("Hey wollef sroirraw"));
    }

    public static String spinWords(String sentence) {
        StringBuilder reversedSentence = new StringBuilder();

        List.of(sentence.split(" ")).forEach(word -> {
            reversedSentence.append(" ");

            if(word.length() < 5){
                reversedSentence.append(word);
            } else {
                reversedSentence.append(new StringBuilder(word).reverse()); }
        });

        return reversedSentence.toString().trim();
    }
}
