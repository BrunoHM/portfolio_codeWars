package main.kyu_6;

public class DuplicateEncoder {
    //Kata: https://www.codewars.com/kata/598106cb34e205e074000031
    public static void main(String[] args) {
        System.out.println(encode("Prespecialized").equals(")()())()(()()("));
        System.out.println(encode("   ()(   ").equals("))))())))"));

    }

    static String encode(String word){
        //My solution to this kata
        word = word.toLowerCase();

        String encodedString = "";
        String charsUsed = "";

        for(int index = 0; index < word.length(); index++){

            String currentLetter = String.valueOf(word.charAt(index));
            String lettersLeft = word.substring(index+1);

            if(lettersLeft.contains(currentLetter) || charsUsed.contains(currentLetter)){
                encodedString += ")";
            }else{
                encodedString += "(";
            }

            charsUsed += currentLetter;

        }

        return encodedString;
    }

    static String encode2(String word){
        //Best approach to this kata
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);

            //If the last occurrence for the current letter is the same as the first occurrence, then, it's only have that one letter and it's not multiples along the word. Clever
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }

}

