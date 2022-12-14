package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Main().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        int idx = 0;

        for(int i = 0; i<num_list.length/n; i++){
            for(int j =0; j<n; j++){
                answer[i][j] = num_list[idx];
                idx++;
            }
        }
        return answer;
    }
}

