package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
      System.out.print(new Main().solution("-1 -2 -3 -4"));

    }
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        answer.append(arr[0]).append(" ").append(arr[arr.length-1]);

        return answer.toString();
    }
}