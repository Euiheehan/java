package main;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }

    public int solution(String[] babbling) {
        String[] bases = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for(String s : babbling){

            boolean isContains = true;
            int notCount = 0;

            //문자열이 없어질 때까지 반복
            while(s.length()>0){
                //해당 문자열의 접두어가 base중에 있는지 확인
                for(String str : bases){
                    if(s.startsWith(str)){
                        //접두어에 있으면 그 문자열 비우고 다시 넣기
                        s = s.replaceAll(str,"");
                        //이거 안해주면 notCount는 누적이라 yemawoo같은 경우는 밑에서 false로 걸림
                        notCount = 0;
                        break;
                    }else{
                        //맞는것이 없으면 ++
                        notCount++;
                    }
                }
                //다 돌았는데도 notCount가 base길이랑 같으면 하나도 안맞는거니까 다음 문자열로.
                if(notCount == bases.length) {
                    isContains = false;
                    break;
                }
            }
            if(isContains) answer++;
        }
        return answer;
    }
}

