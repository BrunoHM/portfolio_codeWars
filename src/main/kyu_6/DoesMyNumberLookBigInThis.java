package main.kyu_6;

public class DoesMyNumberLookBigInThis {

    public static void main(String[] args) {
        System.out.println(solution(152));
        System.out.println(solution(153));
        System.out.println(solution(18234));
    }

    public static boolean solution(int givenNumber) {
        if(givenNumber >=0 && givenNumber < 10){ return true; }

        char[] nums = String.valueOf(givenNumber).toCharArray();

        int singleNumFromNumsArray = 0;
        int sumNumber = 0;
        int tempNumber = 0;

        for (char num : nums) {
            singleNumFromNumsArray = Integer.valueOf(String.valueOf(num));
            tempNumber = singleNumFromNumsArray;

            for(int i = 1;i < nums.length;i++) {
                tempNumber = tempNumber * singleNumFromNumsArray;
            }
            sumNumber += tempNumber;
        }

        return sumNumber == givenNumber;
    }
}
