package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
      System.out.print(new Main().solution(new int[]{1,2,8,3,4}, 4));

    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i<priorities.length; i++){
            map.put(i, priorities[i]);
            queue.offer(i);
        }

        while(!queue.isEmpty()){
            Integer cur = queue.poll();
            //stream 쓰니까 2,5,18에서 시간 초과나옴
            //int max = map.get(queue.stream().max(Comparator.comparing(map::get)).orElse(0));
            int max = map.get(cur);
            for(int i : queue){
                if(max < map.get(i)) {
                    max = map.get(i);
                    break;
                }
            }

            if(map.get(cur) != max) {
                queue.offer(cur);
            } else {
                answer++;
                if(location == cur) return answer;
            }
        }

        return answer;
    }
}