package main;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(2,1,20));
    }

    public int solution(int a, int b, int n) {
        return (n - b) / (a - b) * b;
        //문제에서는 항상 b<n 이기 때문에 조건 없어도된다.
        //return (n > b ? n - b : 0) / (a - b) * b;
    }
}