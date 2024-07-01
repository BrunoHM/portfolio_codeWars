package main.kyu_6;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class FindTheOddInt {
    //Kata: https://www.codewars.com/kata/54da5a58ea159efa38000836
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        System.out.println(solution2(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        System.out.println(solution3(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    }

    public static int solution(int[] a){
        //Mine
        int value[] = new int[1];
        Map<Integer, Long> mapValuesAndFreq = Arrays.stream(a).boxed().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        mapValuesAndFreq.forEach(
                (v, k) -> { if(k % 2 != 0) value[0] = v; }
        );
        return value[0];
    }

    public static int solution2(int[] a){
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            xor ^= a[i];
        }
        return xor;
    }

    public static int solution3(int[] a){
        return stream(a).reduce(0, (x, y) -> x ^ y);
    }

}
