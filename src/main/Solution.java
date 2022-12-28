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

        int l = n*m;
        int[] result = new int[2];
        if(n<m){
            int temp = n;
            n = m;
            m = temp;
        }

        while(m!=0) {
            int r=n%m;
            n=m;
            m=r;
        }
        result[0] = n;

        result[1] = l/result[0];

        return result;
    }
}