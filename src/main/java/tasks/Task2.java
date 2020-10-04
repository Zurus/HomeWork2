package tasks;

import tasks.Exceptions.IncorrectArrayValue;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    private int N;
    private int [] sourceArray;
    private double [] sqrtArray;

    private void initialize () {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите длину массива N");
                N = Integer.parseInt(sc.next());
                break;
            }catch (NumberFormatException e) {
            }
        }
    }


    public Task2() throws IncorrectArrayValue {
        System.out.println("Задание 2");
        System.out.println(Main.STRING_SEPR);
        initialize();
        generateArray();
        checkArrayValue();
    }

    private void generateArray() throws IncorrectArrayValue {
        sourceArray = new int[N];
        sqrtArray = new double[N];

        Random rnd = new Random();
        int val;
        for (int i = 0; i < sourceArray.length; i++) {
            val = (int)(-1 + 10 * rnd.nextDouble());
            if (val < 0) {
                throw new IncorrectArrayValue("Отрицательное значение в массиве");
            }
            sourceArray[i] = val;
            sqrtArray[i] = Math.sqrt((double) val);
        }
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(sourceArray));
        System.out.println("Массив квадратов");
        System.out.println(Arrays.toString(sqrtArray));
        System.out.println(Main.STRING_SEPR);
    }

    private void checkArrayValue () {
        int val;
        for (int i = 0; i < N ; i++) {
            val =  ((int)sqrtArray[i]) *  ((int)sqrtArray[i]);
            if (val == sourceArray[i]) {
                System.out.println("Значение совпадает " + val);
            }
        }
    }
}
