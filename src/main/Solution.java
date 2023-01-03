package main;

import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(new int[]{1, 1, 1, 1, 1}, 3));
    }

    public int solution(int[] numbers, int target) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);

        int count = 0;
        int level = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0; i<len; i++){
                Integer cur = queue.poll();
                if(cur == null) { throw new NullPointerException();}

                if(level == numbers.length){
                    if(cur == target) count++;
                }else{
                    queue.offer(cur+numbers[level]);
                    queue.offer(cur+(-1*numbers[level]));
                }
            }
            level++;

        }
        return count;
    }
}