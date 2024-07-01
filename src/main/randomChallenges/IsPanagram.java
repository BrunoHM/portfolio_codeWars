package main.randomChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IsPanagram {
    public static void main(String[] args) {
        System.out.println(isItPanagram("The quick brown fox jumps over the lazy dog")); //Is panagram
        System.out.println(isItPanagram("The sun sets over the tranquil sea.")); //Isn't panagram
        System.out.println(isItPanagram("Jackdaws love my big sphinx of quartz.")); //Is panagram

    }

    public static String isItPanagram(String sentence){
        List<String> letters = new ArrayList<>();
        letters.addAll(List.of("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));

        sentence = sentence.toLowerCase();

        for(int index = 0; index < sentence.length(); index++){
            String currentLetter = sentence.substring(index, index+1);
            if(letters.contains(currentLetter)) letters.remove(currentLetter);
        }
        return letters.stream().collect(Collectors.joining());
    }

}
