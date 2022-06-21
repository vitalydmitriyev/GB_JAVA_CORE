package lesson03.task01;

import java.util.Arrays;

public class MainClass {
    //task01
    static String[] arrayString = {"Hello", "My", "Long", "Years"};
    static Integer[] arrayInteger = {1,2,3,4};
    static Character[] arrayChar = {'h','e','l','l','0'};

    public static void main(String[] args) {
        SwapArray<Object> swapArray = new SwapArray<>();
        try {
            System.out.println(Arrays.toString(swapArray.swap(arrayString,1, 3)));
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapArray.swap(arrayInteger,1, 2)));
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapArray.swap(arrayChar,1, 0)));
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }

}
