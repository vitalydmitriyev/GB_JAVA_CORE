package lesson03.task02;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Apple> appleArrayList = new ArrayList<>();
        appleArrayList.add(new Apple());
        appleArrayList.add(new Apple());
        appleArrayList.add(new Apple());
        appleArrayList.add(new Apple());
        appleArrayList.add(new Apple());
        Box<Apple> firstBox = new Box<>(appleArrayList);

        ArrayList<Apple> appleArrayList2 = new ArrayList<>();
        appleArrayList2.add(new Apple());
        appleArrayList2.add(new Apple());
        appleArrayList2.add(new Apple());
        appleArrayList2.add(new Apple());
        appleArrayList2.add(new Apple());
        Box<Apple> secondBox = new Box<>(appleArrayList2);

        ArrayList<Orange> orangeArrayList1 = new ArrayList<>();
        orangeArrayList1.add(new Orange());
        orangeArrayList1.add(new Orange());
        orangeArrayList1.add(new Orange());
        orangeArrayList1.add(new Orange());
        orangeArrayList1.add(new Orange());
        Box<Orange> thirdBox = new Box<>(orangeArrayList1);

        System.out.println(firstBox.getWeight());
        System.out.println(secondBox.getWeight());
        System.out.println(thirdBox.getWeight());

        System.out.println(firstBox.compare(secondBox));
        System.out.println(secondBox.compare(thirdBox));
        System.out.println(thirdBox.compare(firstBox));

        firstBox.pourOver(secondBox);
        System.out.println(firstBox.getWeight());
        System.out.println(secondBox.getWeight());
    }
}
