package main;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main main =  new Main();
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(main.solution(s1,s2));
    }

    public int solution(String t, String p) {

        int count = 0;
        if(t.length() == p.length()) return 1;

        for(int i = 0; i<=t.length()-p.length(); i++){
            long A = Long.parseLong(t.substring(i, i+p.length()));
            long B = Long.parseLong(p);

            if(A <= B) count++;
        }
        return count;
    }
}