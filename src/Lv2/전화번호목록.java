package Lv2;

import java.util.Arrays;

// String 의 비교는 compareTo 를 사용합니다.
// 내부적으로 두 문자열 중 길이가 작은 문자열의 길이까지 for 문으로 char 비교를 수행합니다.
// 반복문 중 값이 다르면 char 로 비교되고, 해당 길이까지 동등하다면 두 길이를 비교하는 방법입니다.
// char 의 값은 a, b, c, d 알파벳순으로 나열되어 있습니다.
// 이에 String 은 알파벳순 비교 후 길이로 비교되므로 사전순으로 반환됩니다.
// 여기서 정렬에 사용된 Arrays.sort(Object[] o) 에서도 compareTo 를 사용하도록 명시되어 Arrays.sort(String[] s) 는 사전순으로 정렬됩니다.
// 즉 "12", "1223", "123", "13", "139", "140" 과 같은 순서이기에 직전의 값이 다음 값에 포함되지 않으면 그 다음값은 당연히 연속된 문자가 아닙니다.

public class 전화번호목록 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

        System.out.println(solution(phone_book));
    }
}
