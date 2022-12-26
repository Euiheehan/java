package main;

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
        int maxX = 0;
        int maxY = 0;

        for(int[] size: sizes ){
            maxX = Math.max(maxX, Math.min(size[0], size[1]));
            maxY = Math.max(maxY, Math.max(size[0], size[1]));
        }
        return maxX*maxY;
    }
}