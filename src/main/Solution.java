package main;

import java.util.*;

class Main {
    static int max;
    static int minValue = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();

        int[]arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int amount =  scanner.nextInt();
        System.out.println(main.solution(amount, arr));
    }

    public int solution(int amount, int[] arr) {
        max = amount;

        Integer[] arrI = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrI, Collections.reverseOrder());
        DFS(0,0, arrI);
        return minValue;
    }

    private void DFS(int index, int sum, Integer[] arr){
        //sum이 max보다 크면 재귀돌면 X
        if(sum > max) return;

        //더 도는 것을 방지
        if(index >= minValue) return;
        if(sum == max){
            minValue = Math.min(sum, index);
        }else{
            for (int j : arr) {
                //다음 배열의 원소를 사용O
                DFS(index + 1, sum + j, arr);
            }
        }
    }
}