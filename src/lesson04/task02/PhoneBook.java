package lesson04.task02;

import java.util.HashMap;

public class PhoneBook {
    private final HashMap<String,String> strHashMap = new HashMap<>();

    public void add(String phone, String fio){
        strHashMap.put(phone,fio);
    }

    public String getPhone(String fio){
        if (strHashMap.containsValue(fio)){
            String res = "";
            for (String key: strHashMap.keySet()){
                if(strHashMap.get(key).equals(fio)) res += key +"; ";
            }
            return res;
        } else return "Не найдено.";

    }
}
