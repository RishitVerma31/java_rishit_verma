package com.rishit_verma;
import java.util.*;
public class staircasepyra {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int len = word.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                char ch = word.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
