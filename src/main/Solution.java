package main;

import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }

    public int solution(int[] ingredient) {
        int answer = 0;

        int[]arr= new int[ingredient.length];
        int index = 0;

        for(int i : ingredient){
            arr[index++] = i;

            if(index >= 4 && arr[index-1] == 1
                && arr[index-2] == 3
                && arr[index-3] == 2
                && arr[index-4] == 1
            ){
                answer++;
                index-=4;

            }
        }
        return answer;
    }
}