package fizzbuzz;

public class Dao {

    public static int getValueFromId(int i) {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }

}
