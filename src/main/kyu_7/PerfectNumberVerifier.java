package main.kyu_7;

public class PerfectNumberVerifier {
    //Kata: https://www.codewars.com/kata/56a28c30d7eb6acef700004d
    public static void main(String[] args) {
        System.out.println(isPerfect(28L)); //true
        System.out.println(isPerfect(23459879034L)); //false
    }

    public static boolean isPerfect(long number) {
        int result = 0;

        for(long index = 1; index < number; index++){
            if (number % index == 0) result += index;
        }

        if(result == number){
            return true;
        }
        return false;
    }
}
