package main;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
          System.out.print(new Main().solution("abdc"));
    }

    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        return map.keySet().stream()
                .filter(character -> map.get(character) == 1)
                .map(String::valueOf)
                .sorted()
                .collect(Collectors.joining());
    }
}
