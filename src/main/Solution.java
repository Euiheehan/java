package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
      System.out.print(new Main().solution(new int[]{1,2,8,3,4}, 4));

    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int index = location;
        Queue<Integer> queue = new LinkedList<>();

        for(int i : priorities){
            queue.offer(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;

        while(!queue.isEmpty()){

            Integer cur = queue.poll();
            index--;
            //제일 큰수와 현재 큐의 수가 맞는지 확인
            if(priorities[size-answer] == cur){
                //제일큰수면 그 다음 큰수와 나간 횟수를 위해 answer++해준다.
                answer++;
                if(index < 0) break;
            }else{
                queue.offer(cur);
                //location이 0이나 1인데, 뒤에 큰 수가 있는 경우를 위해
                if(index < 0) index = queue.size()-1;
            }
        }

        return answer;
    }
}