package main;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }

    public int solution(String[] babbling) {
        int answer = 0;
        String[] bases = {"aya", "ye", "woo", "ma"};

        for(String babb : babbling){
            for(String base : bases){
                //babb = babb.replaceFirst(base, "");
                //이렇게 하게 되면 wyeoo -> ye가 치환되고 woo가 남아 치환되어 잘못된 count가 올라간다.
                babb = babb.replaceFirst(base, "#");
                //if(babb.replaceAll("#","").equals("")){  -- replace로 바꾸면 최대 5초 줄어들기 때문에
                if(babb.replace("#","").equals("")){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}

