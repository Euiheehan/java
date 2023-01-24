package main;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution("...!@BaT#*..y.abcdefghijklm"));
    }

    static class KAKAO2021 {

        String s;

        KAKAO2021(String s){
            this.s = s;
        }
        public KAKAO2021 doLowerCase(){
            this.s = s.toLowerCase();
            return this;
        }

        public KAKAO2021 filter(){
            this.s = s.replaceAll("[^-._0-9a-z]", "");
            return this;
        }

        public KAKAO2021 noDots(){
            this.s = s.replaceAll("[.]{2,}", ".");
            return this;
        }

        public KAKAO2021 noStartDotOrEndDot(){
            this.s = s.replaceAll("^[.]|[.]$", "");
            return this;
        }

        public KAKAO2021 notEmpty(){
            this.s = s.equalsIgnoreCase("")? "a" : s;
            return this;
        }

        public KAKAO2021 notLongLength(){
            this.s = s.length() > 15? s.substring(0,15) : s;
            return this;
        }

        public KAKAO2021 limitLength(){
            StringBuilder sb = new StringBuilder(s);
            if(s.length() < 3) {
               this.s = sb.append(String.valueOf(s.charAt(s.length() - 1)).repeat(3 - s.length())).toString();
            }
            return this;
        }

        public String getResult(){
            return s;
        }
    }

    public String solution(String new_id) {

        KAKAO2021 id = new KAKAO2021(new_id);

        return id.doLowerCase()
                .filter()
                .noDots()
                .noStartDotOrEndDot()
                .notEmpty()
                .notLongLength()
                .noStartDotOrEndDot()
                .limitLength()
                .getResult();
    }
}