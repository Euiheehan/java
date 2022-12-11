package main;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int[][] arr = new int[A][A];

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(new Main().solution(arr));
    }

    public int solution(int[][] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int target = arr[i][j];

                //겉 테두리에 0이 있다 생각하고
                // 행이 target 기준으로 i-1,i,i+1
                // 열이 target 기준으로 j-1,j,j+1

                //i-1, j-1 0보다 작으면 0 임
                //i+1, i+1 배열 최대보다 크면 0 임

                if (target > (j - 1 < 0 ? 0 : arr[i][j - 1])
                        && target > (j + 1 > arr.length - 1 ? 0 : arr[i][j + 1])
                        && target > (i - 1 < 0 ? 0 : arr[i - 1][j])
                        && target > (i + 1 > arr.length - 1 ? 0 : arr[i + 1][j])) {
                    count++;
                }
            }
        }
        return count;
    }
}

