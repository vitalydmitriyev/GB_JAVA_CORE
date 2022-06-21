package lesson03.task02;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    T[] fruitArray;

    ArrayList<T> fruitList;

    public Box( ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public float getWeight(){
        float result = 0.0f;
        for(T fruit: getFruitList()){
            result += fruit.getWeight();
        }
        return result;
    }

    public Boolean compare(Box<? extends Fruit> box2){
        return this.getWeight() == box2.getWeight();
    }

    public void pourOver(Box <T> box){
        for (T t:box.getFruitList()){
            this.getFruitList().add(t);
        }
        box.getFruitList().clear();
        System.out.println("Пересыпано.");
    }

    public ArrayList<T> getFruitList(){
        return fruitList;
    }
}
