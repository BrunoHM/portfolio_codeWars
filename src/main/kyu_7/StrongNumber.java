package main.kyu_7;

public class StrongNumber {
    //Kata: https://www.codewars.com/kata/5a4d303f880385399b000001
    public static void main(String[] args) {
        System.out.println(isStrongNumber(145));
        System.out.println(isStrongNumber(7));
    }

    public static String isStrongNumber(int num) {
        String strInitialNum = String.valueOf(num);
        int resultNumber = 0;

        for(int index=0; index < strInitialNum.length(); index++){
            int currentNum  = Integer.valueOf(strInitialNum.substring(index, index+1));
            int sum = 0;

            if(currentNum == 1) sum = 1;

            for(int indexOperations = currentNum-1; indexOperations > 0 ; indexOperations--){
                if(indexOperations == currentNum-1){
                    sum = currentNum*indexOperations;
                }else{
                    sum = sum*indexOperations;
                }
            }
            resultNumber += sum;
        }

        if(num == resultNumber){
            return "STRONG!!!!";
        }
        return "Not Strong !!";
    }
}
