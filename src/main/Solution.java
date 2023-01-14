package main;

import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }

    public int solution(int[] ingredient) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        int index = 0;

        for(int i : ingredient){
            list.add(index++, i);

            if(index >= 3 && list.get(index-1) == 1
                && list.get(index-2) == 3
                && list.get(index-3) == 2
                && list.get(index-4) == 1
            ){
                answer++;
                index-=4;

            }
        }
        return answer;
    }
}