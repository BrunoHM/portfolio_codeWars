package main.Kyu_6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CreatePhoneNumber {
    //Kata: https://www.codewars.com/kata/525f50e3b73515a6db000b83
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(numbers));
    }

    public static String createPhoneNumber(int[] numbers){
        return String.format("(%s%s%s) %s%s%s-%s%s%s%s", Arrays.stream(numbers).boxed().map(integer -> integer.toString()).collect(Collectors.joining()).split(""));
    }

}
