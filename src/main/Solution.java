package main;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int m =  scanner.nextInt();
        main.solution(n, m);
    }

    public void solution(int n, int m) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        int level = 0;
        while(!q.isEmpty() && level<m){
            int len = q.size();
            for(int i = 0; i<len; i++){

                Integer cur = q.poll();
                if(cur == null) throw new NullPointerException();

                for(int j =1; j<n+1; j++){
                    q.offer(j);
                    System.out.println(cur+" "+j);
                }
            }
            level++;
        }
    }
}