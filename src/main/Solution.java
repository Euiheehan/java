package main;

import java.util.Arrays;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Main().solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);

        for(int i=0; i<score.length; i++){
            priorityQueue.offer(score[i]);
            //사이즈가 k번 넘어가면 제일 작은 수 제거하고
            if(priorityQueue.size() > k) {
                priorityQueue.poll();
            }
            //제거한 큐에서 제일 작은 숫자
            answer[i] = priorityQueue.element();
        }
        return answer;
    }
}