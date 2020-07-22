package tim_chuoi_tang_dan_do_dai_lon_nhat;

import java.util.*;
import java.util.Scanner;

public class Exercise_07_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a string : ");
        String s = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < s.length(); i++ ) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) > list.getLast()) {
                    list.add(s.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }

}
