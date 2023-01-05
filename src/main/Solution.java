package main;

import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Main().solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));
    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        String[] toDayArr = today.split("\\.");
        int toDayYear = Integer.parseInt(toDayArr[0]);
        int toDayMonth = Integer.parseInt(toDayArr[1]);
        int toDay = Integer.parseInt(toDayArr[2]);

        int sumToDay = toDay + toDayMonth*28 + (toDayYear*12*28);

        Map<String, Integer> termsMap = new HashMap<>();
        for(String s : terms){
            String[] sp = s.split(" ");
            termsMap.put(sp[0], Integer.parseInt(sp[1])*28);
        }

        for(int i = 0; i< privacies.length; i++){
            String[] pr = privacies[i].split(" ");
            String[] date = pr[0].split("\\.");

            int year = Integer.parseInt(date[0]);
            int sumMonth = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2])+termsMap.get(pr[1]);

            int sumDay = day + sumMonth*28 + (year*12*28);

            if(sumToDay>=sumDay){
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}