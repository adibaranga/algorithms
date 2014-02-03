/**
 * Created with IntelliJ IDEA.
 * User: Adi Baranga
 * Date: 2/3/14
 * Time: 7:33 PM
 */
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("7 is prime: " + isPrimeNumber(7));
        System.out.println("11 is prime: " + isPrimeNumber(11));
        System.out.println("15 is prime: " + isPrimeNumber(15));
        System.out.println("13 is prime: " + isPrimeNumber(13));
        System.out.println("23 is prime: " + isPrimeNumber(23));
        System.out.println("25 is prime: " + isPrimeNumber(25));
        System.out.println("31 is prime: " + isPrimeNumber(31));
        System.out.println("953 is prime: " + isPrimeNumber(953));
    }

    /**
     * Check if a positive number is a prime number
     *
     * @param number
     * @return true if prime, false otherwise
     * @throws IllegalArgumentException if number is negative
     */
    public static boolean isPrimeNumber(int number) {
        if (number < 0) throw new IllegalArgumentException();

        if (number == 1) return false;
        if (number == 2 || number == 3 || number == 5) return true;
        if (number % 2 == 0) return false;
        if (number % 3 == 0) return false;
        if (number % 5 == 0) return false;

        int sqrt = (int) Math.sqrt(number);
        // the prime numbers should be in the format of 6k-1 or 6k+1
        for (int i = 6; i <= sqrt; i += 6) {
            if (number % (i - 1) == 0) {
                return false;
            }
            if (number % (i + 1) == 0) {
                return false;
            }
        }

        return true;
    }
}
