package search_string_lientiep_length_max;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercise_22_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println(" Enter a string : ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length();i++) {
            if (list.size() > 1 && s.charAt(i) <= list.getLast()
            && list.contains(s.charAt(i))) {
                list.clear();
            }
            list.add(s.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
