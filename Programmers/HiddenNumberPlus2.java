import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        // 숫자만 저장할 문자열
        String str = "";

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            // my_string에 위치한 char 타입의 문자가 '0'에서 '9'사이라면 str에 붙인다.
            if (c >= '0' && c <= '9') str += c;
            else {
                // 문자 타입의 숫자가 아니면 int형으로 바꿔서 더해준다.
                if (str.length() != 0) answer += Integer.parseInt(str);
                // 다음 숫자를 저장하기 위해 str을 빈 문자열로 만들어준다.
                str = "";
            }
        }
        // 마지막 char 타입의 문자를 포함해주기 위해서 예외 처리
        if (str.length() != 0) answer += Integer.parseInt(str);

        return answer;
    }
}