package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(3,4, new int[]{1, 2, 3, 1, 2, 3, 1}));
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        if(score.length < m) return 0;

        int count = 1;
        for(int i = score.length-1; i >= 0; i--){
            if(count%m == 0){
                answer += score[i]*m;
            }
            count++;
        }

        return answer;
    }
}