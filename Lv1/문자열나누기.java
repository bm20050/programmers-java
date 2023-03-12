package Lv1;

public class 문자열나누기 {

    public static int solution(String s) {
        String[] ss = s.split("");
        String x = ss[0];
        int xcount = 1;
        int ycount = 0;
        int result = 1;
        for (int i = 1; i < ss.length; i++) {
            if (x.equals(ss[i]))
                xcount++;
            else {
                ycount++;
                if (xcount == ycount) {
                    if (i < ss.length - 1) {
                        x = ss[++i];
                        result++;
                    }

                    xcount = 1;
                    ycount = 0;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "banana";
        String s2 = "abracadabra";
        String s3 = "aaabbaccccabba";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
    }
}
