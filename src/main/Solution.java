package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
      System.out.print(new Main().solution(5, 5, new int[]{2,2,2,2,1,1,1,1,1}));

    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        //대기트럭 Queue
        Queue<Integer> truckQueue = new LinkedList<>();
        for(int truck : truck_weights){
            truckQueue.offer(truck);
        }

        //다리 Queue
        Queue<Integer> bridgeQueue = new LinkedList<>();

        //첫번째 트럭
        Integer o = truckQueue.poll();
        int answer = 1;
        int queueSum = o == null? 0: o;
        bridgeQueue.offer(o);

        //다리에 트럭이 하나도 없을 때까지(==모두 공백일 때)
        while(!bridgeQueue.stream().allMatch(integer -> integer.equals(0))) {
            //다음 트럭(꺼내지말고 하중만)
            Integer cur = truckQueue.peek();

            if(answer >= bridge_length){
                Integer clear = bridgeQueue.poll();
                queueSum -= clear == null? 0 : clear;
            }

            //다리 최대 수량보다 미만이지만, 다음 트럭 싣게되면 무게는 미만일때
            if(bridgeQueue.size() < bridge_length && cur != null && queueSum + cur <= weight){
                Integer t = truckQueue.poll();
                bridgeQueue.offer(t);
                queueSum += t == null? 0 : t;
            }else{
                //아니면 공백 넣기
                bridgeQueue.offer(0);
            }

            answer++;
        }
        return answer;
    }
}