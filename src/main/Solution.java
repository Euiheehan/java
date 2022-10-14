package main;

import java.util.Arrays;
import java.util.Collections;

public class Solution {


    public static void main(String[]args){
        System.out.println(new Solution().solution("Zbcdefg"));
    }

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for (String st:arr) {
            answer.append(st);
        }
        return answer.toString();
    }
}


