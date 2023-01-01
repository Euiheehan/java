package main;

import java.util.*;

class Main {

    static int n;
    static int m;
    static int[] pm;
    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        n =  scanner.nextInt();
        m =  scanner.nextInt();
        pm = new int[m];
        main.DFS(0);
    }

    public void DFS(int index) {
        
        if(index == m){
            for(int x : pm) System.out.print(x +" ");
            System.out.println();
        }else{
            for(int i =1; i<=n; i++){
                pm[index] = i;
                DFS(index+1);
            }
        }
    }
}