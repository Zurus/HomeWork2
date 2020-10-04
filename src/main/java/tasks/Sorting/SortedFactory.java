package tasks.Sorting;

import tasks.Exceptions.MyException;

public class SortedFactory {
    public static Sortable getSort(int idx) throws MyException {
        switch (idx) {
            case 0:
                return new SorterByAge();
            case 1:
                return new SorterByName();
            case 2:
                return new SorterBySex();
            default:
                throw new MyException();
        }
    }
}
