package main;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int m =  scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++ ){
            arr[i] = scanner.nextInt();
        }
        main.solution(n, m, arr);
    }

    public void solution(int n, int m, int[] arr) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(arr[0]);
        int level = 0;
        while(!q.isEmpty() && level<m){
            int len = q.size();
            for(int i = 0; i<len; i++){

                Integer cur = q.poll();
                if(cur == null) throw new NullPointerException();

                for(int j =0; j<n; j++){
                    if(cur !=arr[j])  {
                        q.offer(arr[j]);
                        System.out.println(cur+" "+arr[j]);
                    }

                }
            }
            level++;
        }
    }
}