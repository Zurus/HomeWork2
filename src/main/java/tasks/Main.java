package tasks;


import javafx.concurrent.Task;
import tasks.Exceptions.IncorrectArrayValue;
import tasks.Exceptions.MyException;

import java.util.List;

public class Main {
    public static String STRING_SEPR = "==================================================================";

    private static void Test1(){
        //Задание 1
        //Task1 task1 = new Task1();
        //task1.modelingArrayIndexOutOfBoundException();
        //task1.modelingNullPointerException();
        //task1.throwingException();


    }

    public static <T> T subNumber(T num1){
        List<? extends T> list = null;
        return null;
    }

    private static void Test2() {
        //Задание 2
        //Task2 task2 = new Task2();
    }

    private static void Test3() throws MyException {
        //Задание 3
        Task3 task3 = new Task3();
    }

    public static void main(String[] args) throws IncorrectArrayValue, MyException {
        Test3();
    }
}
