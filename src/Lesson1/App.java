package Lesson1;

import java.util.Arrays;
import java.util.Collections;

public class App {
    //    1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static void main(String[] args) {
        String[] stringArr = {"1", "2"};

        System.out.println(Arrays.toString(stringArr));
        changeEl(stringArr);
        System.out.println(Arrays.toString(stringArr));

        int[] intArr = {1, 2};

        System.out.println(Arrays.toString(intArr));
        changeEl(intArr);
        System.out.println(Arrays.toString(intArr));
    }

    public static <T> void changeEl(T ... Arr) {
        if (Arr.length >= 2) {
            Object y;
            y = Arr[0];
            Arr[0] = Arr[1];
            Arr[1] = (T) y;
        }
    }
}
