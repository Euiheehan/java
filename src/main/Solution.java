package main;

import java.util.Arrays;
import java.util.Collections;

public class Solution {


    public static void main(String[]args){
        System.out.println(new Solution().solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2}));
    }

    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;

        //return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}


