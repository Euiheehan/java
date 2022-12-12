package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new String[]{"119", "97674223", "1195524421"}));
    }

    public boolean solution(String[] phone_book) {
        //문자열 길이로 정렬
        Arrays.sort(phone_book, Comparator.comparing(String::length));

        int min = phone_book[0].length();

        //"같은 전화번호가 중복해서 들어있지 않습니다." 다같은 길이의 문자(최소길이와 최대길이가 같으면)면 true
        if(min == phone_book[phone_book.length-1].length()) return true;

        Map<String, Integer> map = new HashMap<>();

        for (String s : phone_book) {
            //최소 단위의 문자길이부터 (같은 길이의 같은 문자열은 없으므로) 본인 길이까지 잘라서 검사
            for (int j = min; j < s.length(); j++) {
                String key = s.substring(0, j);
                if (map.get(key) != null && map.get(key) > 0) {
                    return false;
                }
            }
            //본인 문자열 저장
            map.put(s, map.getOrDefault(s,0)+1);
        }
        return true;
    }
}

