package main;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(45));
    }

    public int solution(int n) {
        String num = Integer.toString(n,3);
        return Integer.parseInt(new StringBuilder(num).reverse().toString(),3);

    }
}

