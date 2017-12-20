package entityClasses;

/**
 * Created by Misha on 05.09.2017.
 */

/**
 * Class ODArray child of class Array
 * Implements a one-dimensional array
 */
public class ODArray extends Array {

    public int length;
    public int[] arr;

    /** One-dimensional array constructor
     * @param length - array size
     */
    public ODArray(int length){
        this.length = length;
        arr = new int[length];
    }

    public ODArray(){}

    /**
     * The method returns the value of the array element.
     * @param position
     * @return value of array element
     */
    public int getElement(int position){
        return arr[position];
    }

    /**
     * The method set the value for the array element
     * @param position - index of the element
     * @param value - value of the element
     */
    public void setElement(int position, int value){
        if(position <= arr.length) {
            arr[position] = arr[value];
        }
        else System.out.println("Wrong position value.");
    }

    /**
     * Overriding the method toString()
     * @return the value of str
     */
    public String toString(){
        String str = "";
        for (int i = 0; i < length; i++){
            str += arr[i] + " ";
        }
        return str;
    }
}