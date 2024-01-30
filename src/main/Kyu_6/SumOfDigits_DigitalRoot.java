package main.Kyu_6;

public class SumOfDigits_DigitalRoot {

    public static void main(String[] args) {
        System.out.println(solution(16));
        System.out.println(solution(293));
        System.out.println(solution(979));
    }

    public static int solution(int givenNumber){
        String givenNumberStr = String.valueOf(givenNumber);

        if(givenNumber > 9){
            int sum = 0;
            for (char number:givenNumberStr.toCharArray()) {
                sum += Integer.valueOf(""+number);
            }
            return solution(sum);
        } else {
            return givenNumber;
        }
    }

}
