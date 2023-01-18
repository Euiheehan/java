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
                s = s.replace("aya", " ");
                s = s.replace("ye", " ");
                s = s.replace("woo", " ");
                s = s.replace("ma", " ");
                s = s.replace(" ","");

                if(s.length() ==0) answer++;
            }
        }
        return answer;
    }
}