package main;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }

    public int[] solution(int []arr) {
        String answer = String.valueOf(arr[0]);
        int beforeNum = arr[0];

        for(int i : arr){
            if(beforeNum != i){
                answer += i;
                beforeNum = i;
            }
        }
       return Arrays.stream(answer.split("")).mapToInt(Integer::parseInt).toArray();
    }
}


