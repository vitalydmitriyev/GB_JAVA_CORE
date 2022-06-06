package lesson02;

public class MainClass {
    public static void main(String[] args){
        String[][] array = genArray();
        String[][] arraySizeEx = genSizeExArray(10,4);
        String[][] arrayDataEx = genDataExArray();
        try {
            System.out.println(getSumArray(array));
        } catch (MyArrayDataException | MyArraySizeException as ){
            System.out.println(as.getMessage());
        }
        try {
            System.out.println(getSumArray(arraySizeEx));
        } catch (MyArrayDataException | MyArraySizeException as ){
            System.out.println(as.getMessage());
        }
        try {
            System.out.println(getSumArray(arrayDataEx));
        } catch (MyArrayDataException | MyArraySizeException as ){
            System.out.println(as.getMessage());
        }
    }

    private static void checkArraySize(String[][] array) throws MyArraySizeException{
        if (array.length != 4 || array[0].length != 4){
            throw new MyArraySizeException("Не верный размер массива");
        }
    }
    private static int getSumArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        checkArraySize(array);
        int result = 0;
        int i = 0;
        int j = 0;
        try {
            for( i = 0; i < array.length; i++ ){
                for ( j = 0; j < array[i].length; j++){
                    result += Integer.parseInt(array[i][j]);
                }
            }
            return result;
        } catch (NumberFormatException nf){
            String message = "Ошибка данных в " + i + " " + j;
            throw new MyArrayDataException(message);
        }
    }
    //генерация верного массива
    static String[][] genArray(){
        String[][] array = new String[4][4];
        for( int i = 0; i < array.length; i++ ){
            for ( int j = 0; j < array[i].length; j++){
                array[i][j] = String.valueOf(i + j);
            }
        }
        return array;
    }
    static String[][] genSizeExArray(int width, int height){
        if (width == 4 && height == 4){
            width++;
        }
        String[][] array = new String[width][height];
        for( int i = 0; i < array.length; i++ ){
            for ( int j = 0; j < array[i].length; j++){
                array[i][j] = String.valueOf(i + j);
            }
        }
        return array;
    }
    static String[][] genDataExArray(){
        String[][] array = new String[4][4];
        for( int i = 0; i < array.length; i++ ){
            for ( int j = 0; j < array[i].length; j++){
                array[i][j] = String.valueOf(i + j);
            }
        }
        array[3][2] = "Hello";
        return array;
    }
}
