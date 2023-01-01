package main;

import java.util.*;

class Main {
    static int max;
    static int maxValue = 0;

    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int m =  scanner.nextInt();

        int[] arr = new int[m];

        for(int i = 0; i<m; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(main.solution(n, arr));
    }

    public int solution(int weight, int[] arr) {
        max = weight;
        DFS(0,0, arr);
        return maxValue;
    }

    private void DFS(int index, int sum, int[] arr){
        //sum이 max보다 크면 재귀돌면 X
        if(sum > max) return;

        //sum이 max보다 작으면서 하나의 부분집합이 만들어졌을 때,
        if(index == arr.length){
            maxValue = Math.max(sum, maxValue);
        }else{
            //다음 배열의 원소를 사용O
            DFS(index+1, sum+arr[index], arr);
            //다음 배열의 원소를 사용X
            DFS(index+1, sum, arr);
        }
    }
}