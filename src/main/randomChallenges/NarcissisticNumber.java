package main.randomChallenges;

public class NarcissisticNumber {
    public static void main(String[] args) {
        System.out.println(solution(371));
        System.out.println(solution(119));
        System.out.println(solution(58381));
    }

    public static boolean solution(int number){
        String strNumber = String.valueOf(number);
        int lengthNumber = strNumber.length();
        int result = 0;

        for(int index = 0; index < lengthNumber; index++){
            String strCurrentNumber = strNumber.substring(index, index+1)+lengthNumber;
            result += Integer.valueOf(strCurrentNumber);
        }
        if(result == number){
            return true;
        }
        return false;
    }
}
