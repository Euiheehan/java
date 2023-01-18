package main;

class Main {
    public static void main(String[] args) {
      System.out.print(new Main().solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));

    }
    public int solution(String[] babbling) {
        int answer = 0;

        for(String s : babbling){

            //연속된 옹알이는 무조건 2개 붙은 옹알이를 포함하기 때문에
            if(!(s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo")|| s.contains("mama"))){
                s = s.replaceAll("aya|ye|woo|ma", " ");
            }
            s = s.replace(" ", "");

            if("".equalsIgnoreCase(s)) answer++;
        }
        return answer;
    }
}