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
        int GCD = getGCD(Math.min(n, m), Math.max(n, m));

        return new int[] {GCD, (n * m) / GCD};
    }

    public int getGCD(int small, int big) {
        return big % small != 0 ? getGCD(big % small, small) : small;
    }
}