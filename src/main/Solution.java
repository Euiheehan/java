package main;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution("...!@BaT#*..y.abcdefghijklm"));
    }

    public String solution(String new_id) {
        new_id = new_id.toLowerCase().replaceAll("[^-._0-9a-z]", "");
        while(new_id.contains("..")){
            new_id = new_id.replaceAll("\\.\\.", ".");
        }
        if(new_id.startsWith(".")) new_id = new_id.substring(1);
        if(new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length()-1);
        if("".equalsIgnoreCase(new_id)) new_id = "a";
        if(new_id.length() > 15) new_id = new_id.substring(0,15);
        if(new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length()-1);

        if(new_id.length() < 3) {
            StringBuilder sb = new StringBuilder(new_id);
            new_id = sb.append(String.valueOf(new_id.charAt(new_id.length() - 1)).repeat(3 - new_id.length())).toString();
        }
        return new_id;
    }
}