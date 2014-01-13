import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Get all the anagrams of a word using recursion
 * <p/>
 * <p/>
 * Created with IntelliJ IDEA.
 * User: baranga
 * Date: 1/13/10
 */
public class Anagrams {

    public static void main(String[] args) {
        String word = getWord();

        if (word != null) {
            List<String> anagrams = getAnagrams(word);
            System.out.println(anagrams);
        }
    }


    private static List<String> getAnagrams(String word) {
        List<String> anagrams = new ArrayList<String>();
        char[] array = word.toCharArray();
        doAnagrams(array, array.length, anagrams);
        return anagrams;
    }

    private static void doAnagrams(char[] array, int size, List<String> anagrams) {
        if (size == 1) {
            return;
        }
        for (int i = 0; i < size; i++) {
            doAnagrams(array, size - 1, anagrams);
            if (size == 2) {
                anagrams.add(new String(array));
            }
            rotate(array, size);
        }
    }

    private static void rotate(char[] array, int size) {
        int position = array.length - size;
        char temp = array[position];
        int i;
        for (i = position + 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[i - 1] = temp;
    }


    private static String getWord() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
}
