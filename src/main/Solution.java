package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Main().solution(9, new int[]{10, 30, 40, 3, 0, 20, 4})));
    }

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] arr = new int[k];

        if(k>score.length) k = score.length;


        int min =  Integer.MAX_VALUE;
        for(int i = 0; i<k; i++){
            arr[i] = score[i];
            min = Math.min(score[i], min);
            answer[i] = min;
        }


        for(int i = k; i<score.length; i++){
            Arrays.sort(arr);
            if(arr[0] < score[i]) arr[0] = score[i];
            Arrays.sort(arr);
            answer[i] = arr[0];
        }
        return answer;
    }
}