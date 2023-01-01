package main;

import java.util.*;

class Main {
    static int max;
    static int maxValue;

    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int limitTime =  scanner.nextInt();

        int[][] arr = new int[n][2];

        for(int i = 0; i<n; i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        System.out.println(main.solution(limitTime, arr));
    }

    public int solution(int limitTime, int[][] arr) {
        max = limitTime;
        DFS(0,0,0, arr);
        return maxValue;
    }

    private void DFS(int index, int totalScore, int totalTime, int[][] arr){
        //totalTime이 max보다 크면 재귀돌면 X
        if(totalTime > max) return;

        //totalTime이 max보다 작으면서 하나의 부분집합이 만들어졌을 때,
        if(index == arr.length){
            maxValue = Math.max(totalScore, maxValue);
        }else{
            //다음 배열의 원소를 사용O
            DFS(index+1, totalScore+arr[index][0],totalTime+arr[index][1], arr);
            //다음 배열의 원소를 사용X
            DFS(index+1, totalScore, totalTime, arr);
        }
    }
}