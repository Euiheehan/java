package main;

import java.util.*;

class Main {
    static int maxTarget;
    static int count;
    public static void main(String[] args) {

        System.out.println(new Main().solution(new int[]{1, 1, 1, 1, 1}, 3));
    }

    public int solution(int[] numbers, int target) {
        maxTarget = target;
        DFS(0,0,numbers);
        return count;
    }

    private void DFS(int index, int sum, int[]arr){
        if(index == arr.length){
            System.out.println(sum);
            if(sum == maxTarget) count++;
        }else{
            //다음 배열의 원소를 +1
            DFS(index+1, sum+arr[index], arr);
            //다음 배열의 원소를 -1
            DFS(index+1, sum-arr[index], arr);
        }
    }
}