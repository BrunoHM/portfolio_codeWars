package main.kyu_6;

public class PersistentBugger {
    //Kata: 55bf01e5a717a0d57e0000ec https://www.codewars.com/kata/
    public static void main(String[] args) {
        System.out.println(persistence(9)   == 0);
        System.out.println(persistence(39)  == 3);
        System.out.println(persistence(999) == 4);
    }

    public static int persistence(long n) {
        if(n <= 9) return 0;
        return recursivePersistence(n, 1);
    }

    public static int recursivePersistence(long longNum, int operationsIndex) {

        char numsArray[] = String.valueOf(longNum).toCharArray();
        int num = 1;

        for(int index=0; index < numsArray.length; index++){
            num = Character.getNumericValue(numsArray[index]) * num;
        }

        if(num <= 9) {
            return operationsIndex;
        }

        return recursivePersistence(num, ++operationsIndex);
    }

    public static int firstPersistence(long n) {
        //First tested solution, works but isn't optimized
        if(n <= 9) return 0;

        String strNumber = String.valueOf(n);

        boolean hasMultiplication = true;

        int multiplications = 1;

        while (hasMultiplication) {

            char nums[] = strNumber.toCharArray();

            int num = 1;

            for(int index=0; index < nums.length; index++){
                num = Character.getNumericValue(nums[index]) * num;
            }

            if(num <= 9) {
                hasMultiplication = false;
            }else{
                strNumber = String.valueOf(num);
                multiplications++;
            }

        }

        return multiplications;
    }

}
