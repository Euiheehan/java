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

        for(int i =0; i<commands.length; i++){
            int subStart = commands[i][0]-1;
            int subEnd = commands[i][1];
            int k = commands[i][2]-1;

            int[] subStringArr = Arrays.stream(Arrays.copyOfRange(array, subStart, subEnd)).sorted().toArray();
            answer[i] = subStringArr[k];
        }

        return answer;
    }
}

