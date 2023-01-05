package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Main().solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));
    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        LocalDate toDay = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));

        Map<String, Integer> termsMap = new HashMap<>();
        for(String s : terms){
            String[] sp = s.split(" ");
            termsMap.put(sp[0], Integer.parseInt(sp[1]));
        }

        for(int i = 0; i< privacies.length; i++){
            String[] pr = privacies[i].split(" ");
            LocalDate target = LocalDate.parse(pr[0], DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            target = target.plusMonths(termsMap.get(pr[1]));


            if(target.compareTo(toDay) <= 0) answer.add(i+1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}