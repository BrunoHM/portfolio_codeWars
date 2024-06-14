package main.kyu_6;

public class CountingDuplicates {
    //Kata: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
    public static void main(String[] args) {

        System.out.println(solution("aabbcde"));
        System.out.println(solution("Indivisibilities"));
        System.out.println(solution("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
    }

    public static int solution(String text){
        int num = 0;
        String letter = "";
        text = text.toLowerCase();
        while(!text.isEmpty()){
            letter = text.substring(0,1);
            if(text.lastIndexOf(letter) > 0){
                num++;
            }
            text = text.substring(1).replaceAll(letter, "").trim();
        }

        return num;
    }

}
