package main;

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution("one4seveneight"));
    }

    public int solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);

        StringBuilder result = new StringBuilder();
        int start = 0;
        for(int i = 1; i<=s.length(); i++){
            String str = s.substring(start,i);

            if(str.chars().allMatch(Character::isDigit)){
                result.append(str);
                start = i;
            }

            if(map.get(str) != null){
                result.append(map.get(str));
                start = i;
            }
        }
        return Integer.parseInt(result.toString());
    }
}