package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);");
        String[] stringArr = {"1", "2"};

        System.out.println("Массив типа String:");
        System.out.println(Arrays.toString(stringArr));
        changeEl(stringArr);
        System.out.println(Arrays.toString(stringArr));

        Integer[] intArr = {1, 2};

        System.out.println("Массив типа Integer");
        System.out.println(Arrays.toString(intArr));
        changeEl(intArr);
        System.out.println(Arrays.toString(intArr));

        System.out.println("2. Написать метод, который преобразует массив в ArrayList;");

        System.out.println(Arrays.toString(toArrayList(stringArr).toArray()));

        System.out.println("3. Большая задача:");
//    3. Большая задача:
//
//    Есть классы Fruit -> Apple, Orange (больше фруктов не надо);
//    Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//    Для хранения фруктов внутри коробки можно использовать ArrayList;
//    Сделать метод getWeight(), который высчитывает вес коробки, зная количество фруктов и вес одного фрукта (вес яблока – 1.0f, апельсина – 1.5f. Не важно, в каких это единицах);
//    Внутри класса Коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true – если она равны по весу, false – в противном случае (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//    Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую (помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами). Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//    Не забываем про метод добавления фрукта в коробку.

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Box<Apple> boxApples1 = new Box<>();

        boxApples1.addFruit(apple1);
        boxApples1.addFruit(apple2);
        boxApples1.addFruit(apple3);

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Orange> boxOranges1 = new Box<>();

        boxOranges1.addFruit(orange1);
        boxOranges1.addFruit(orange2);

        if (boxApples1.compare(boxOranges1)){
            System.out.println("Коробка 1 с яблоками по весу равна коробке 1 с апельсинами.");
        }
        else{
            System.out.println("Коробки не равны.");
        }

        // boxOranges1.addFruit(apple1); // Ошибка, нельзя добавлять разные фрукты в одну коробку.

        System.out.println("Вес коробки 1 с апельсинами :");
        System.out.println(boxOranges1.getWeight());

        Box<Orange> boxOranges2 = new Box<>();

        boxOranges2.addFruit(orange1);
        boxOranges2.addFruit(orange2);

        System.out.println("Вес коробки 2 с апельсинами :");
        System.out.println(boxOranges2.getWeight());

        boxOranges1.intersperseFruit(boxOranges2);

        System.out.println("После перекладывания фруктов из первой коробки во вторую.");
        System.out.println("Вес коробки 1 с апельсинами : " + boxOranges1.getWeight());
        System.out.println("Вес коробки 2 с апельсинами : " + boxOranges2.getWeight());
    }

    public static <T> void changeEl(T[] Arr) {
        if (Arr.length >= 2) {
            T y;
            y = Arr[0];
            Arr[0] = Arr[1];
            Arr[1] = y;
        }
    }

    public static <T> ArrayList<T> toArrayList(T[] Arr) {

        ArrayList<T> resultArrayList = new ArrayList<>(Arrays.asList(Arr));

        return resultArrayList;
    }
}
