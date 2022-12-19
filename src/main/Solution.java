package main;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(13,17));
    }

    public int solution(int left, int right) {
        int answer = 0;

        for(int i =left; i<=right; i++){
            answer = divisorCount(i)%2 ==0? answer+i : answer-i;
        }
        return answer;
    }

    private int divisorCount(int num){
        if(num == 1) return 1;
        int count = 0;
        //num이 20이면 4*4까지만 돌아도된다.
        for(int i =1; i*i<=num; i++){
            //그 중 나누어 떨어지는 수
            if(num % i ==0){
                //몫이 나누는수와 같으면 ex) 4*4
                if(num/i == i){
                    count++;
                }else{
                    count +=2;
                }
            }
        }
        return count;
    }
}

