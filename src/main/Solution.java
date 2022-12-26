package main;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main main =  new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] sizes = new int[n][m];
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                sizes[i][j] = scanner.nextInt();
            }
        }
        System.out.println(main.solution(sizes));
    }

    public int solution(int[][] sizes) {

       return Arrays.stream(sizes)
                .reduce((x, y) -> new int[]{
                        Math.max(Math.min(x[0], x[1]), Math.min(y[0],y[1])) //더 작은 값 중의 최대 값
                        ,Math.max(Math.max(x[0], x[1]), Math.max(y[0],y[1]))  // 더 큰 값 중의 최대 값
                }).map(ints -> ints[0] *ints[1]).orElse(0);
    }
}