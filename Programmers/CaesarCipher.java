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