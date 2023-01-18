package main;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr= new int[M];
        for(int i =0; i<M; i++){
            arr[i] = in.nextInt();
        }
        int[] result = new Main().solution(N,arr);
        for(int i : result){
            System.out.print(i+" ");
        }

    }


    public int[] solution(int n, int[] arr) {

        int[] result = new int[n];

        for(int num : arr){
            int pos = n-1; //인덱스 번호, 위치
            for(int i=0; i<n; i++){
                if(num == result[i]) pos = i; //같은 값이 있으면 같은 값이 있는 인덱스 넣어주고, 아니면 -1
            }

            //같은 값 없을 때(pos = n-1),끝->앞으로 가면서 하나씩 뒤로 땡기기
            //같은 값 있을 때 (pos =i), 같은 지점 -> 앞으로 가면서 하나씩 뒤로 땡기기
            if (pos >= 0) System.arraycopy(result, 0, result, 1, pos);
            result[0] = num;
        }
        return result;
    }
}