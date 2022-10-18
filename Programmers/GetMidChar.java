class Solution {
    public String solution(String s) {
        String answer = "";
        // s의 길이를 반으로 나눈 수 저장
        int half = s.length() / 2;
        
        // s가 홀수인지 짝수인지 판별, 짝수라면 chk == true
        if (s.length() % 2 != 0) {
            answer += s.charAt(half);
        }
        else {
            answer += s.charAt(half - 1);
            answer += s.charAt(half);
        }
        return answer;
    }
}
