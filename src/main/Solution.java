package main;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(13,17));
    }

    public int solution(int left, int right) {
        int answer = 0;

        for(int i =left; i<=right; i++){
            //제곱수인 경우 약수의 개수는 홀수,
            //제곱수가 아닌 약수의 개수는 짝수
            answer = i%Math.sqrt(i) == 0? answer-i : answer+i;
        }
        return answer;
    }
}

