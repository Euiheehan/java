package main;

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
          System.out.print(new Main().solution("olleh","hello"));
    }

    public int solution(String before, String after) {
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");

        Map<String, Integer> map  = new HashMap<>();
        for(String s1:afterArr){
            map.put(s1, map.getOrDefault(s1, 0)+1);
        }

        for (String s : beforeArr) {
            if(map.get(s) == null) return 0;
            if(map.get(s) == 1){
                map.remove(s);
            }else{
                map.put(s, map.get(s)-1);
            }
        }
        if(!map.isEmpty()){
            return 0;
        }
        return 1;
    }
}
