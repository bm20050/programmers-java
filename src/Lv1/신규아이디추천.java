package Lv1;

public class 신규아이디추천 {
    public static String solution(String new_id) {
        new_id = new_id.toLowerCase();

        for (int i = 0; i < new_id.length(); i++) {
            if (!Character.isAlphabetic(new_id.charAt(i)) && !Character.isDigit(new_id.charAt(i)) && new_id.charAt(i) != '_' && new_id.charAt(i) != '-' && new_id.charAt(i) != '.') {
                new_id = new_id.replace(new_id.substring(i, i + 1), "");
                i--;
            }
        }
        while (new_id.contains("..")){
            new_id = new_id.replace("..", ".");
        }
        if (new_id.startsWith("."))
            new_id = new_id.substring(1);
        if (new_id.endsWith("."))
            new_id = new_id.substring(0, new_id.length() - 1);
        if (new_id.equals(""))
            new_id = "a";
        if (new_id.length() >= 16)
            new_id = new_id.substring(0, 15);
        if (new_id.length() <= 2)
            while (new_id.length() < 3)
                new_id += new_id.substring(new_id.length() - 1);
        return new_id;
    }
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String new_id2 = "z-+.^.";
        String new_id3 = "abcdefghijklmn.p";
        System.out.println(solution(new_id));
        System.out.println(solution(new_id2));
        System.out.println(solution(new_id3));
    }
}
