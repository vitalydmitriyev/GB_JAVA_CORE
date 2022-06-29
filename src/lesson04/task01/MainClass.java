package lesson04.task01;

import java.util.*;

public class MainClass {
    public static String txt = "голубой красный синий фиолетовый зелёный " +
            "красный голубой синий зелёный голубой красный фиолетовый синий зелёный " +
            "красный синий фиолетовый голубой зелёный голубой красный фиолетовый синий зелёный красный фиолетовый синий зелёный " +
            "красный голубой синий красный красный голубой синий зелёный красный синий зелёный голубой";
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(convertToArray()));
        System.out.println(getHashMap(stringList));

    }
    public static String[] convertToArray(){
        return txt.split(" ");
    }
    public static HashMap<String,Integer> getHashMap(ArrayList<String> al){
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>(al);
        for (String str:set){
            map.put(str,count(al,str));
        }
        return map;
     }
    public static Integer count(ArrayList<String> al, String str){
        Integer result = 0;
        for(String value : al)
        {
            if(str.equals(value))    result++;
        }
        return result;
    }
}


