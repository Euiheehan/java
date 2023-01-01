package main;

import java.util.*;

class Main {

    static int n;
    static int m;
    static int[] combi;
    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        n =  scanner.nextInt();
        m =  scanner.nextInt();
        combi = new int[m];
        main.DFS(0, 1);
    }

    public void DFS(int index, int s) {

        if(index == m){
            for(int x : combi) System.out.print(x +" ");
            System.out.println();
        }else{
            for(int i =s; i<=n; i++){
                combi[index] = i;
                DFS(index+1, i+1);
            }
        }
    }
}