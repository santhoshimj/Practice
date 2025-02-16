import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        // Create an object of the Anagram class
        Anagram anagram = new Anagram();

        // Call the anaFunc method
        anagram.anaFunc(c1, c2);
    }

    public void anaFunc(char[] c1, char[] c2) {
        Arrays.sort(c1);
        Arrays.sort(c2);

        int n = c1.length;
        int m = c2.length;

        if (m != n) {
            System.out.println("It's not an anagram!");
            return;
        }

        // Compare sorted arrays
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.println("It's not an anagram!");
                return;
            }
        }

        System.out.println("It's an anagram!");
    }
}
