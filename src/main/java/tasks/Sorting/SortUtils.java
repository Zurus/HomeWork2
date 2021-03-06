package tasks.Sorting;

import tasks.Exceptions.EqualsPersonException;
import tasks.Person;
import tasks.Sex;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class SortUtils {
    private static int N = 10000;


    public static Person[] generatePersons() {
        Person[] persons = new Person[N];
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < N ; i++) {
            String randomName = new BigInteger(130, secureRandom).toString(32);
            int age = secureRandom.nextInt(100);
            Sex sex = secureRandom.nextInt() < 50 ? Sex.MAN: Sex.WOMAN;

            persons[i] = new Person(randomName,age,sex);
        }
        return persons;
    }

    public static void TestPersonData (Person[] persons) throws EqualsPersonException {
        for (int i = 0; i < persons.length - 1; i++) {
            if (persons[i].equals(persons[i+1])) {
                throw new EqualsPersonException("Ошибка в данных");
            }
        }
    }
}
