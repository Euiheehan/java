package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();

        int[]arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int amount =  scanner.nextInt();
        System.out.println(main.solution(amount, arr));
    }

    public int solution(int amount, int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);

        int level = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0 ; i<len; i++){
                Integer cur = queue.poll();
                if(cur == null) throw new NullPointerException();

                for(int n : arr){
                    int sum = cur+n;
                    if(sum == amount) return level+1;
                    if(sum < amount) queue.offer(sum);
                }
            }
            level++;
        }
        return level;
    }
}