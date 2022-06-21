package lesson03.task01;

public class SwapArray <T>{

    public T[] swap(T[] array, int firstElement, int secondElement){
        T buffer = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = buffer;
        return array;
    }
}
