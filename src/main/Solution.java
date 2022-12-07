package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    public int solution(String[] spell, String[] dic) {
        for(String s : dic){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(spell);
            if(new String(arr).equals(String.join("",spell))){
                return 1;
            }
        }
        return 2;
    }
}
