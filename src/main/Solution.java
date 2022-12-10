package main;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Main {
    public static void main(String[] args) {
        for(int i : new Main().solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})){
            System.out.print(i);
        }
    }
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        List<Integer> list = new ArrayList<>();

        int len =  progresses.length;

        for(int i = 0; i< len; i++){
            int todoTask = 100-progresses[i];
            int day = todoTask % speeds[i] != 0? todoTask / speeds[i] +1 : todoTask / speeds[i];
            queue.offer(day);
        }

        int count = 1;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            while(!queue.isEmpty() && queue.peek()<= cur){ //작업기간이 같거나 작을때 같이 배포
                queue.poll();
                count++;
            }
            list.add(count);
            count = 1;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}


