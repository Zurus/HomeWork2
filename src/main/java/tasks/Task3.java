package tasks;

import tasks.Exceptions.MyException;
import tasks.Sorting.SortUtils;
import tasks.Sorting.Sortable;
import tasks.Sorting.SortedFactory;

import java.util.Arrays;

public class Task3 {

    private void printData (Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }

    public Task3() throws MyException {
        Person[] persons = SortUtils.generatePersons();
        Sortable sortable = SortedFactory.getSort(2);
        printData(persons);
        sortable.sort(persons);
        System.out.println(Main.STRING_SEPR);
        printData(persons);
    }
}
