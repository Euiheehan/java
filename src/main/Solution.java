package main;

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution("5525","1255"));
    }

    public String solution(String X, String Y) {
        List<Character> list = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();
        for(char y : Y.toCharArray()){
            map.put(y, map.getOrDefault(y,0)+1);
        }

        for(char x : X.toCharArray()){
           if(map.getOrDefault(x,0) !=0){
               map.put(x, map.get(x)-1);
               list.add(x);
           }
        }

        if(list.isEmpty()) return "-1";
        if(list.stream().allMatch(character -> character == '0')) return "0";
        return list.stream().sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining());
    }
}