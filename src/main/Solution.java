package main;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution("one4seveneight"));
    }

    public int solution(String s) {
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i = 0; i<arr.length; i++){
            s = s.replaceAll(arr[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}