package tasks;

public enum Sex {
    WOMAN(0),
    MAN(1);


    private int idx;
    Sex(int idx) {
        this.idx = idx;
    }

    public int getIdx() {
        return idx;
    }
}
