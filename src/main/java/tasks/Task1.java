package tasks;

import tasks.Exceptions.MyException;

public class Task1 {
    public Task1() {
        System.out.println("Задание 1");

    }

    public void modelingNullPointerException() {
        String firstText = "someText";
        String secondText = null;
        firstText.equalsIgnoreCase(secondText);
    }

    public void modelingArrayIndexOutOfBoundException() {
        int[] arr = new int[10];
        System.out.println(arr[15]);
    }

    public void throwingException() throws MyException {
        throw new MyException();
    }
}
