package tinh_do_phuc_tap_thuat_toan;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a string : ");
        String s  = sc.nextLine();

        int[] frequentChar = new int[225];
        for (int i = 0; i< s.length();i++) {
            int ascii = (int) s.charAt(i);
            frequentChar[ascii] += 1;
        }

        int max = 0;
        char character = (char) 225;
        for (int j = 0; j < 225; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println(" The most appearing letter is " + character + " with a frequency of " + max + " times ");
    }
}
