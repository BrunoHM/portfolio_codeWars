package main.kyu_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheParityOutlier {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {13, 37, 61, 87, 9, 79, 99, 68, 55, 31, 97, 7, 93, 73, 43, 33, 25, 81, 59,23, 17,
                63, 89, 15, 19, 3, 41, 71, 77, 27, 11, 75, 49, 53, 29, 5, 45, 91, 1, 65, 21, 83, 67, 47, 85, 95, 51, 35, 57}));
    }

    public static int solution(int[] numbersList){

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers  = new ArrayList<>();

        Arrays.stream(numbersList).forEach(
                obj -> {
                    if(obj%2 == 0){
                        evenNumbers.add(obj);
                        return;
                    }
                    oddNumbers.add(obj);
                }
        );

        if(evenNumbers.size() > oddNumbers.size()){
            return oddNumbers.get(0);
        }
        return evenNumbers.get(0);
    }
}
