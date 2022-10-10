class Solution {
    public int solution(String s) {
        int answer = 0;
        // s의 첫 번째 값이 -이면 음수이므로 문자열에서 제거해준 후 정수형으로 변환할 때 -1을 곱해준다.
        if (s.charAt(0) == '-') {
            s = s.replace("-", "");
            answer = Integer.parseInt(s) * (-1);
        }
        // 0이거나 정수이므로 정수형으로 변환
        else answer = Integer.parseInt(s);

        return answer;
    }
}