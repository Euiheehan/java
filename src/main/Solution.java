package main;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main main =  new Main();
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();


        System.out.println(Arrays.toString(main.solution(s1, s2)));
    }


    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n,m);
        answer[1] = (n*m)/answer[0];
        return answer;
    }

    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        return gcd(q, p%q);
    }
}