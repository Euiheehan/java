package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Main().solution("banana")));
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;

        char[] arr = s.toCharArray();
        for(int i = 1; i<s.length();i++){
            for(int j = i-1; j>=0; j--){
                if(arr[i] == arr[j]) {
                    answer[i] = i-j;
                    break;
                }else{
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}