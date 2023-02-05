package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(new int[]{1, 4, 2}, new int[]{5,4,4}));
    }

    public int solution(int []A, int []B) {
        int sum = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i<A.length; i++){
            sum += A[i] * B[B.length-1-i];
        }
        return sum;
    }
}