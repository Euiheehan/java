package main;

import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Main().solution(5, new int[]{1,2,2,1,3})));
    }

    public int[] solution(int N, int[] stages) {
        List<Integer> list = new ArrayList<>();

        double totalPlayer = stages.length;

        Map<Integer, Double> map = new HashMap<>();

        for(int i = 1; i <=N; i++){
            double notClear = 0;
            for(int s : stages){
                if(i==s) notClear++;
            }
            map.put(i, totalPlayer == 0? 0 : notClear/totalPlayer);
            list.add(i);

            totalPlayer = totalPlayer-notClear;
        }

        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}