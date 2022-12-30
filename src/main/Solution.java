package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(main.solution(arr));
    }

    public int solution(int[] number) {
        int answer = 0;

        for(int i = 0; i<number.length; i++){
            for(int j = i+1; j<number.length; j++){
                for(int k = j+1; k<number.length; k++){
                   if(number[i]+number[j]+number[k] == 0){
                       answer++;
                   }
                }
            }
        }
        return answer;
    }
}