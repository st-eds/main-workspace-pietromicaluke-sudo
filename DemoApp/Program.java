import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        String word = "hello buddy";
        String[] letters = word.split("");

        System.out.println(Arrays.toString(letters));
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + i);
        }
    }
}