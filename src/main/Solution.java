package main;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(Arrays.toString(main.solution(new int[]{1, 3, 2, 4, 2})));
    }

    public int[] solution(int[] answers) {

        List<Integer> answer = new ArrayList<>();

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] a3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();


        for(int i = 0; i< answers.length; i++ ){
            list1.add(a1[i%a1.length]);
            list2.add(a2[i%a2.length]);
            list3.add(a3[i%a3.length]);
        }

        int ac = 0, bc = 0, cc = 0;
        for(int i = 0; i< answers.length; i++){
            if(answers[i]==list1.get(i)) ac++;
            if(answers[i]==list2.get(i)) bc++;
            if(answers[i]==list3.get(i)) cc++;
        }

        if(ac >= bc && ac >= cc){
            answer.add(1);
        }
        if(bc >= cc && bc>= ac){
            answer.add(2);
        }
        if(cc >= ac && cc>= bc){
            answer.add(3);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}