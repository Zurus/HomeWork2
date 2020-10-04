package tasks.Sorting;

import tasks.Person;

import java.util.Arrays;
import java.util.Comparator;

public class SorterByName implements Sortable {

    public void sort(Person[] persons) {
        Arrays.sort(persons, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
