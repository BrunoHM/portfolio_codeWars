package main.kyu_7;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {
    //Kata: https://www.codewars.com/kata/5b39e3772ae7545f650000fc
    public static void main(String[] args) {
        System.out.println(removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        System.out.println(removeDuplicateWords("my cat is my cat fat"));
    }

    public static String removeDuplicateWords(String s){
        return List.of(s.split(" ")).stream().distinct().collect(Collectors.joining(" "));
    }

}
