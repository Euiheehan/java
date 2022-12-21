package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().solution(
                new int[]{1, 5, 2, 6, 3, 7, 4}
                , new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int index = 0;
        for(int[] arr : commands){
            int subStart = arr[0]-1;
            int subEnd = arr[1];
            int k = arr[2]-1;

            int[] subStringArr = Arrays.copyOfRange(array, subStart, subEnd);
            Arrays.sort(subStringArr);
            answer[index++] = subStringArr[k];
        }
        return answer;
    }
}

