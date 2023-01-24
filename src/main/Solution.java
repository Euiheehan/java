package main;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution("...!@BaT#*..y.abcdefghijklm"));
    }

    public String solution(String new_id) {
        new_id = new_id.toLowerCase()
                .replaceAll("[^-._0-9a-z]", "")
                .replaceAll("[.]{2,}", ".")
                .replaceAll("^[.]|[.]$", "");

        if("".equalsIgnoreCase(new_id)) new_id = "a";
        if(new_id.length() > 15) new_id = new_id.substring(0,15);

        new_id = new_id.replaceAll("^[.]|[.]$", "");

        StringBuilder sb = new StringBuilder(new_id);
        if(new_id.length() < 3) {
            sb.append(String.valueOf(new_id.charAt(new_id.length() - 1)).repeat(3 - new_id.length()));
        }
        return sb.toString();
    }
}