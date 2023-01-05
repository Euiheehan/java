package main;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(2,1,20));
    }

    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int share = n/a * b;
            answer += share;
            n = share + (n%a);
        }
        return answer;
    }
}