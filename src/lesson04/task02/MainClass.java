package lesson04.task02;

public class MainClass {

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("123","Petrov");
        pb.add("456","Petrov");
        pb.add("789","Petrov");
        pb.add("222","Ivanov");
        pb.add("333","Dautov");
        pb.add("444","Burunov");
        pb.add("555","Petrov");

        System.out.println(pb.getPhone("Petrov"));
        System.out.println(pb.getPhone("999"));
    }


}
