package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Main().solution("banana")));
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s.length();i++){
            answer[i] = map.containsKey(s.charAt(i))? i-map.get(s.charAt(i)) : -1;
            map.put(s.charAt(i), i);
        }
        return answer;
    }
}