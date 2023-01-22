package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
      System.out.print(new Main().solution(2, 10, new int[]{7, 4, 5, 6}));

    }
    static class Truck{
        int weight;
        int move;

        public Truck(int weight){
            this.weight = weight;
            this.move = 1;
        }

        public void moving(){
            move++;
        }
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        //대기트럭 Queue
        Queue<Truck> truckQueue = new LinkedList<>();
        for(int truck : truck_weights){
            truckQueue.offer(new Truck(truck));
        }

        //다리 Queue
        Queue<Truck> bridgeQueue = new LinkedList<>();

        int answer = 0;
        int queueSum = 0;

        while(!bridgeQueue.isEmpty() || !truckQueue.isEmpty()){
            answer++;

            //첫번째 트럭
            if (bridgeQueue.isEmpty()) {
                Truck t = truckQueue.poll();
                queueSum += t.weight;
                bridgeQueue.offer(t);
                continue;
            }

            //다리 위의 트럭 모두 한칸씩 움직이기
            for(Truck t : bridgeQueue){
                t.moving();
            }
            //다리위 트럭의 움직임이 다리길이보다 크면
            if(!bridgeQueue.isEmpty() && bridgeQueue.peek().move > bridge_length){
                Truck clear = bridgeQueue.poll();
                queueSum -= clear == null? 0 : clear.weight;
            }

            //다리 최대 수량보다 미만이지만, 다음 트럭 싣게되면 무게는 미만일때
            if(!truckQueue.isEmpty()
                    && truckQueue.peek() != null && queueSum + truckQueue.peek().weight <= weight){
                Truck t = truckQueue.poll();
                queueSum += t == null? 0 : t.weight;
                bridgeQueue.offer(t);
            }
        }
        return answer;
    }
}