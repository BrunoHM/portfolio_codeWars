package main.kyu_7;

public class AnagramDetection {
    //Kata: https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java
    public static void main(String[] args) {
        System.out.println(isAnagram("Buckethead", "DeathCubeK"));
        System.out.println(isAnagram("apple", "pale"));
    }

    public static boolean isAnagram(String test, String original) {
        if(test == null || original == null) return false;
        for(int index=0; index<test.length(); index++){
            String letter = test.substring(index, index+1).toLowerCase();
            if(test.toLowerCase().replaceAll(letter,"").length() !=
            original.toLowerCase().replaceAll(letter,"").length()){
                return false;
            }
        }
        return true;
    }
}
