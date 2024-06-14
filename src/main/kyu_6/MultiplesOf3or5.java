package main.kyu_6;

public class MultiplesOf3or5 {
    public static void main(String[] args) {
        System.out.println(solution(123));
    }

    public static int solution(int givenNumber) {
        int answer = 0;
        int fiveForValue = 0;

        if(givenNumber > 3){
            for(int index = 1; index <= givenNumber/3; index++){
                fiveForValue = 5*index;

                answer += 3*index;
                if(fiveForValue < givenNumber && fiveForValue%3 != 0){
                    answer += fiveForValue;
                }
            }
        }

        return answer;
    }

}

