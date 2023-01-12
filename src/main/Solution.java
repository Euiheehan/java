package main;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(10));
    }

    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i= 2; i<= n; i++){
            if(arr[i] == 0){
                answer++;
                for(int j = i; j<=n; j+=i){
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }
}