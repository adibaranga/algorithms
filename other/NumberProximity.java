/**
 * Created with IntelliJ IDEA.
 * User: Adi Baranga
 * Date: 2/3/14
 * Time: 8:31 PM
 */
public class NumberProximity {
    public static void main(String[] args) {
        System.out.println("Closest to 10 from 9 and 15 is " + closest(9, 15, 10));
        System.out.println("Closest to -10 from -15 and 1 is " + closest(-15, 1, -10));
        System.out.println("Closest to -10 from 1 and 6 is " + closest2(1, 6, -10));
        System.out.println("Closest to -10.0 from 1.0 and 6.0 is " + closest2(1.0d, 6.0d, -10.0d));
        System.out.println("Closest to -10 from 1 and 6 is " + closest2((byte)1, (byte)6, (byte) -10));
    }

    /**
     * Given 2 numbers val1 and val2 determine which one is closest to the third number
     *
     * @param val1
     * @param val2
     * @param number
     * @return val1 or val2
     */
    private static int closest(int val1, int val2, int number) {
        int dif1 = number - val1;
        int dif2 = number - val2;

        if (Math.abs(dif1) < Math.abs(dif2)) {
            return val1;
        } else {
            return val2;
        }
    }


    private static <T extends Number> T closest2(T val1, T val2, T number) {

        double dif1 = number.doubleValue() - val1.doubleValue();
        double dif2 = number.doubleValue() - val2.doubleValue();

        if (Math.abs(dif1) < Math.abs(dif2)) {
            return val1;
        } else {
            return val2;
        }
    }

}
