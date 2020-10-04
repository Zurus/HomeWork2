package tasks.Sorting;

import tasks.Person;

import java.util.Arrays;
import java.util.Comparator;

public class SorterByAge implements Sortable{
    public void sort(Person[] persons) {
        Arrays.sort(persons, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return new Integer(o2.getAge()).compareTo(o1.getAge());
            }
        });
    }
}
