package main;

import java.util.*;

class Main {

    static int n;
    static int m;
    static int[] pm;
    static int[] ch;
    static int[] result;
    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        n =  scanner.nextInt();
        m =  scanner.nextInt();
        pm = new int[n];
        ch = new int[n];
        result = new int[m];
        for(int i = 0; i<n; i++){
            pm[i] =  scanner.nextInt();
        }
        main.DFS(0);
    }

    public void DFS(int index) {

        if(index == m){
            for(int x : result) System.out.print(x +" ");
            System.out.println();
        }else{
            for(int i =0; i<n; i++){
                if(ch[i] == 0){
                    ch[i] =1;
                    result[index] = pm[i];
                    DFS(index + 1);
                    ch[i] =0;
                }
            }
        }
    }
}