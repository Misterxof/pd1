package view;

import entityClasses.ODArray;
import logic.Logic;

/**
 * Created by Misha on 05.09.2017.
 */

/**
 * Class View demonstrates the work of the program
 */
public class View {

    public static void main(String[] args){

        int[] resultSum;
        int[] resultSubtraction;
        int[] resultMultiplying;

        ODArray array = new ODArray(10);
        ODArray array2 = new ODArray(10);
        Logic logic = new Logic(array, array2);

        logic.fillArrays();

        System.out.println("First array");
        System.out.println(array + "\n");

        System.out.println("Second array");
        System.out.println(array2 + "\n");

        System.out.println("Sum of two arrays");
        resultSum = logic.sumArrays();
        for (int i = 0; i < resultSum.length; i++) {
            System.out.print(resultSum[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Subtraction of two arrays");
        resultSubtraction = logic.subtractionArrays();
        for (int i = 0; i < resultSubtraction.length; i++) {
            System.out.print(resultSubtraction[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Multiplying of two arrays");
        resultMultiplying = logic.multiplyingArrays();
        for (int i = 0; i < resultMultiplying.length; i++) {
            System.out.print(resultMultiplying[i] + " ");
        }
    }
}