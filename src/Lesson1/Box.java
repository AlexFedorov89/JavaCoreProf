package Lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> fruitArrays;

    public Box() {
        this.fruitArrays = new ArrayList<>();
    }

    public boolean compare(Box boxToCompare){
        boolean result = false;

        if(this.getWeight() == boxToCompare.getWeight()){
            result = true;
        }

        return result;
    }

    public double getWeight() {
        double sum = 0.0;

        for (T fruitArray : fruitArrays) {
            sum += fruitArray.getWeightOneFruit();
        }

        return sum;
    }

    public void addFruit(T fruitToAdd){
        fruitArrays.add(fruitToAdd);

        System.out.println("Фрукт добавлен.");
    }

    public void clearFruits(){
        fruitArrays.clear();
    }

    public ArrayList<T> getFruitArrays() {
        return fruitArrays;
    }

    public void intersperseFruit(Box boxDest){
        ArrayList<T> fruitArraysDest = boxDest.getFruitArrays();

        System.out.println("Начинаем пересыпать фрукты.");

        this.fruitArrays.addAll(fruitArraysDest);

        boxDest.clearFruits();

        System.out.println("Фрукты пересыпаны из первой коробки во вторую.");
    }
}

