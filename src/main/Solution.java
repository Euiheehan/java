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

        int answer = 0;
        //행
        int[]dx = {-1,0,1,0};
        //열
        int[]dy = {0,1,0,-1};

        /*
         * (1,1) 기준으로 4개를 비교해야될 때,
         * [0,0] [1,1] [2,2] [3,3]
         * (0,1) (1,2) (2,1) (1,0) 을 비교하는 것
         * */


        for (int i=0; i<arr.length; i++) {
            for(int j = 0; j<arr.length; j++){
                boolean isTrue = true;
                int target = arr[i][j];
                for(int k = 0; k<4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx >= 0 && nx <arr.length
                            && ny >= 0 && ny <arr.length
                            && target <= arr[nx][ny]) {
                        isTrue=false;
                        break;
                    }
                }
                answer += isTrue? 1 : 0;
            }
        }
        return answer;
    }
}

