package main;

import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Main().solution(5, new int[]{1,2,2,1,3})));
    }

    public int[] solution(int N, int[] stages) {
        List<Integer> list = new ArrayList<>();

        int totalPlayer = stages.length;
        //0인덱스와 모두 클리어한 플레이어는 stage+1로 저장되기 때문에
        //2가지 버전을 커버하기위해 +2를 해준다.
        int[] notClear = new int[N+2];
        for(int s : stages){
            notClear[s]++;
        }
        Map<Integer, Double> map = new HashMap<>();

        for(int i = 1; i <=N; i++){
            list.add(i);
            map.put(i, totalPlayer == 0? 0 : (double)notClear[i]/totalPlayer);
            totalPlayer = totalPlayer-notClear[i];
        }

        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}