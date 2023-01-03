package main;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = Arrays.stream(scoville).boxed().collect(Collectors.toCollection(PriorityQueue::new));

        int count = 0;
        while(queue.element() < K){
            Integer cur = queue.poll();
            Integer min = queue.poll();
            if(cur == null || min == null) return -1;

            queue.offer(cur + min*2);
            count++;
        }
        return count;
    }
}