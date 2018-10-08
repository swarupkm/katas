public class Adder {
    private static Adder instance;
    private int i1;
    private int i2;

    private Adder() {
    }

    public static Adder getInstance() {
        if (instance == null)
            instance = new Adder();

        return instance;
    }

    public void initialize(int i1, int i2) {

        this.i1 = i1;
        this.i2 = i2;
    }

    public int addmethod() {
        return i1+i2;
    }
}
