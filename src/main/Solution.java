package main;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(Arrays.toString(main.solution(new int[]{1, 3, 2, 4, 2})));
    }

    public int[] solution(int[] answers) {

        List<Integer> answerPerson = new ArrayList<>();

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] a3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int ac = 0, bc = 0, cc = 0;
        for(int i = 0; i< answers.length; i++){
            if(answers[i]==a1[i%a1.length]) ac++;
            if(answers[i]==a2[i%a2.length]) bc++;
            if(answers[i]==a3[i%a3.length]) cc++;
        }

        if(ac >= bc && ac >= cc) answerPerson.add(1);
        if(bc >= cc && bc>= ac) answerPerson.add(2);
        if(cc >= ac && cc>= bc) answerPerson.add(3);

        int[] result = new int[answerPerson.size()];
        for(int i = 0; i<result.length; i++){
            result[i] = answerPerson.get(i);
        }
        return result;
    }
}