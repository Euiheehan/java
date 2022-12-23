package main;

import java.util.Scanner;

class Main {
    static int n = 0;
    static int m = 0;
    static int answer = 0;

    static int[][] graph;
    static int[] ch;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];

        for(int i = 0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        //출발노드 check
        ch[1] = 1;
        main.DFS(1);
        System.out.println(answer);
    }

    public void DFS(int v) {
        if( v == n ){
            answer++;
        }else{
            for(int i=1; i<=n; i++){
                if(graph[v][i] == 1 && ch[i] == 0){
                    //체크 넣어주기
                    ch[i] =1;
                    DFS(i);
                    //back한 경우는 체크 풀어주기
                    ch[i] = 0;
                }
            }
        }
    }
}