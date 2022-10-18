import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // 대문자와 소문자, 공백을 판별하는 배열 만들기
        int[] check = new int[s.length()];
        for (int i = 0; i < check.length; i++) {
            // 대문자는 1, 소문자와 공백은 -1
            if (Character.isUpperCase(s.charAt(i))) check[i] = 1;
            else check[i] = -1;
        }
        // 문자열을 소문자 형태로 저장
        String lowerStr = s.toLowerCase();
        // 반복문을 순회하면서 해당 위치의 알파벳을 구한다.
        for (int i = 0; i < lowerStr.length(); i++) {
            if (lowerStr.charAt(i) != ' ') {
                // 해당 위치 알파벳의 인덱스를 저장
                int temp = lower.indexOf(lowerStr.charAt(i));
                // n만큼 이동한 칸의 인덱스 저장
                int tobe = (temp + n + lower.length()) % lower.length();
                // 대문자인지 판별 후 대문자이면 대문자로 변환
                if (check[i] == 1) answer += upper.charAt(tobe);
                else answer += lower.charAt(tobe);
            } else answer += " ";
        }

        return answer;
    }
}

// 더 좋은 코드!
class Caesar {
    String caesar(String s, int n) {
        String result = "";
        // 알파벳의 주기는 26이므로 n이 26보다 커지는 경우 나눈 나머지만큼의 칸만 이동하면 된다.
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 소문자이면 ch에서 'a' 만큼 뺀 후 n만큼 이동한 값을 26으로 나눠주면 'a'로부터 n칸 이동한 값이 된다.
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }
}