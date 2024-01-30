package main.Kyu_6;

public class BreakCamelCase {
    //Kata: https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
    public static void main(String[] args) {
        System.out.println(solution("camelcasingtest"));
        System.out.println(solution("camelCasing"));
    }



    public static String solution(String a){
        StringBuilder str = new StringBuilder();
        char c[] = a.toCharArray();
        int lastIndexSubstring = 0;

        for(int index = 0; index < a.length(); index++){
            String b = String.valueOf(c[index]);

            if(b.equals(b.toUpperCase())) {
                str.append(a.substring(lastIndexSubstring, index)+" ");
                lastIndexSubstring = index;
            }
        }
        str.append(a.substring(lastIndexSubstring));
        return str.toString();
    }
}
