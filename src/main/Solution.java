package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
        for(int n :new Main().solution(new int[]{1, 2, 3, 4, 5, 6},4)){
            System.out.print(n+" ");
        }
    }

    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : numlist){
            map.put(num, map.getOrDefault(num,Math.abs(n-num)));
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((o1, o2) -> {
            if(Objects.equals(map.get(o1), map.get(o2))){
                return o2.compareTo(o1);
            }
            return map.get(o1).compareTo(map.get(o2));
        });


        for (int i =0; i<keys.size(); i++){
            answer[i] = keys.get(i);
        }
        return answer;
    }
}
