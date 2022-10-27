import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 문자열 배열로 변환
        String[] arr = my_string.split("");

        // contains 메서드를 사용하여 문자열 붙여주기
        for (String a : arr) {
            if (!answer.contains(a)) answer += a;
        }

        return answer;
    }
}