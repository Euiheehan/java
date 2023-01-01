package main;

import java.util.*;

class Main {
    static int[][] dy;
    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int r =  scanner.nextInt();
        dy = new int[n+1][n+1];
        System.out.println(main.DFS(n,r));
    }

    public int DFS(int n, int r) {

        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r==0) return 1;
        else return dy[n][r] = DFS(n-1, r-1)+DFS(n-1, r);
    }
}