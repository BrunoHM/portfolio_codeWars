package main.kyu_6;

public class TheDeafRatsOfHamelin {
    //Kata: https://www.codewars.com/kata/598106cb34e205e074000031
    public static void main(String[] args) {
        System.out.println(countDeafRats("~O~O~O~O P") == 0);
        System.out.println(countDeafRats("P O~ O~ ~O O~") == 1);
        System.out.println(countDeafRats("~O~O~O~OP~O~OO~") == 2);

        //Additional test cases
        System.out.println(countDeafRats("~O~O~O~O~O~OO~ P ~O~OO~~O~OO~") == 5);
        System.out.println(countDeafRats("~O~O~O~OO~ P ~O~O~O~O~OO~") == 6);
    }

    public static int countDeafRats(final String town) {
        int pIndex = town.indexOf("P");
        int deafRats = 0;
        String currentReadChar = "";

        for(int loopIndex=0; loopIndex < town.length(); loopIndex++){
            currentReadChar = Character.toString(town.charAt(loopIndex));

            //The order in the static String below of the valid characters isn't relevant in this point.
            if( "O~".contains(currentReadChar) ){
                if(loopIndex < pIndex && currentReadChar.equals("O")
                || loopIndex > pIndex && currentReadChar.equals("~")){
                    deafRats++;
                }
                //Ignoring the next position, because it will be part of the same rat yet.
                loopIndex++;
            }
        }
        return deafRats;
    }
}