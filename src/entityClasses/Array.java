package entityClasses;

/**
 * Created by Misha on 05.09.2017.
 */

/**
 * Abstract class Array
 */
public abstract class Array {
    int length;

    /**
     * Constructor of class Array
     * @param length - размер массива
     */
    Array(int length){
        this.length = length;
    }

    Array(){}

    /**
     * The method changes the value of the field length.
     * @param length - array size
     */
    public void setLength(int length){
        this.length = length;
    }

    /**
     * The method returns the value of the field length.
     * @return the value of length
     */
    public int getLength(){ return length;}
}