package main;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(new int[]{1, 3, 4, 6}));
    }

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder("0");

        for (int i = food.length - 1; i > 0; i--) {
            String s = String.valueOf(i).repeat(food[i]/2);
            answer.insert(0,s).append(s);
        }
        return answer.toString();
    }
}