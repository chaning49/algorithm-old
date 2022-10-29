import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        // A와 B가 같으면 0 반환
        if (B.equals(A)) return 0;

        // 반복문을 순회하면서 밀린 문자열을 비교한다.
        while (answer < B.length()) {
            // answer 1 증가
            answer += 1;

            // A의 맨 뒤 글자를 맨 앞으로 옮겨준다.
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);

            // 리스트를 String으로 변환해서 B와 비교
            if (B.equals(A)) {
                break;
            }
        }
        return answer == B.length() ? -1 : answer;
    }
}