package logic;

import entityClasses.ODArray;
import java.util.Random;

/**
 * Created by Misha on 05.09.2017.
 */

/**
 * Class Logic contains methods for working with objects of type ODArray.
 */
public class Logic {

    ODArray od, od2;

    /**
     * Constructor of  logic
     * @param od - objects with type ODArray
     * @param od2 - objects with type ODArray
     */
    public Logic(ODArray od, ODArray od2){
        this.od = od;
        this.od2 = od2;
    }

    /** The method fills the array with numbers. */
    public void fillArrays(){
        Random random = new Random();

        for (int i = 0; i < od.length; i++){
            od.arr[i] = random.nextInt(100);
        }

        for (int i = 0; i < od2.length; i++){
            od2.arr[i] = random.nextInt(100);
        }
    }

    /**
     * The method calculates and displays the result of sum arrays.
     */
    public int[] sumArrays(){
        int[] sum;

        if(od.length > od2.length){
            sum = new int[od.length];
            for (int i = 0; i < od2.length; i++){
                sum[i] = od.arr[i] + od2.arr[i];
            }
        }
        else{
            sum = new int[od2.length];
            for (int i = 0; i < od.length; i++){
                sum[i] = od.arr[i] + od2.arr[i];
            }
        }
        return sum;
    }

    /** The method calculates and displays the result of the subtraction of arrays. */
    public int[] subtractionArrays(){
        int[] subtraction;

        if(od.length > od2.length){
            subtraction = new int[od.length];
            for (int i = 0; i < od2.length; i++){
                subtraction[i] = od.arr[i] - od2.arr[i];
            }
        }
        else{
            subtraction = new int[od2.length];
            for (int i = 0; i < od.length; i++){
                subtraction[i] = od.arr[i] - od2.arr[i];
            }
        }
        return subtraction;
    }

    /** The method calculates and displays the result of multiplying of arrays. */
    public int[] multiplyingArrays(){
        int[] mul;

        if(od.length > od2.length){
            mul = new int[od.length];
            for (int i = 0; i < od2.length; i++){
                mul[i] = od.arr[i] * od2.arr[i];
            }
        }
        else{
            mul = new int[od2.length];
            for (int i = 0; i < od.length; i++){
                mul[i] = od.arr[i] * od2.arr[i];
            }
        }
        return mul;
    }
}