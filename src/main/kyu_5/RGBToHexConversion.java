package main.kyu_5;

import java.util.HashMap;
import java.util.List;

public class RGBToHexConversion {
    //Kata: https://www.codewars.com/kata/513e08acc600c94f01000001
    public static void main(String[] args) {
        System.out.println(rgb(265, 255, 255));
        System.out.println(rgb(-20, 275, 125));
        System.out.println(rgb(148, 0, 211));
    }

    public static String rgb(int r, int g, int b) {
        HashMap<Integer, String> hexCodeMap = getFulfilledHexCodeMap();

        r = normalizeNumber(r);
        g = normalizeNumber(g);
        b = normalizeNumber(b);

        String resultHex  = conversionToHex(r, hexCodeMap);
        resultHex += conversionToHex(g, hexCodeMap);
        resultHex += conversionToHex(b, hexCodeMap);

        return resultHex;
    }

    public static String conversionToHex(int rgbVal, HashMap<Integer, String> hexCodeMap){
        String result = "";

        Double rgbHex = (Double.valueOf(rgbVal)/16);
        result = hexCodeMap.get(rgbHex.intValue());
        rgbHex = (rgbHex%1)*16;
        result += hexCodeMap.get(rgbHex.intValue());

        return result;
    }

    public static int normalizeNumber(int number){
        return Integer.min(
                Integer.max(0, number),
                Integer.min(255, Integer.max(0, number))
        );
    }

    public static HashMap<Integer, String> getFulfilledHexCodeMap(){
        List<String> hexCodesList = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F");
        HashMap<Integer, String> hexCodeMap = new HashMap<>();

        for(int index = 0; index < hexCodesList.size(); index++){
            hexCodeMap.put(index, hexCodesList.get(index));
        }

        return hexCodeMap;
    }

}

