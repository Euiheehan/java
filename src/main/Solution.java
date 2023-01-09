package main;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(new int[]{1, 3, 4, 6}));
    }

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i =1; i< food.length; i++){
            answer.append(String.valueOf(i).repeat(food[i]/2));
        }
        StringBuilder reverseAnswer = new StringBuilder(answer);
        return answer.append(0).append(reverseAnswer.reverse()).toString();
    }
}