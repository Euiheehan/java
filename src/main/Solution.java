package main;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Main {
    public static void main(String[] args) {
        for(int i : new Main().solution(new int[]{1, 1, 1, 1}, new int[]{100, 50, 99, 100})){
            System.out.print(i);
        }
    }
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        List<Integer> list = new ArrayList<>();

        int len =  progresses.length;

        for(int i = 0; i< len; i++){
            int day = (int) Math.ceil((double) (100-progresses[i])/speeds[i]);

            if(!queue.isEmpty() && queue.peek() < day){
                list.add(queue.size());
                queue.clear();
            }
            queue.offer(day);
        }
        list.add(queue.size());
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}


