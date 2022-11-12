import java.util.*;

class Solution {
    public int solution(String my_string) {
        // 문자열을 공백 기준으로 배열에 저장
        String[] strArr = my_string.split(" ");

        // 첫번째 값을 저장
        int answer = Integer.parseInt(strArr[0]);

        // 연산자만 체크해서 다음 값을 더하거나 빼준다.
        for (int i = 1; i < strArr.length; i += 2) {
            if (strArr[i].equals("+")) answer += Integer.parseInt(strArr[i + 1]);
            if (strArr[i].equals("-")) answer -= Integer.parseInt(strArr[i + 1]);
        }

        return answer;
    }
}