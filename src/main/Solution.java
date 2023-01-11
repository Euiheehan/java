package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(3,4, new int[]{1, 2, 3, 1, 2, 3, 1}));
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);


        for(int i = score.length; i >= m; i-=m){
          answer += score[i-m]*m;
        }

        return answer;
    }
}