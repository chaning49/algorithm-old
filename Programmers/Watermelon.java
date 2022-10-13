class Solution {
    public String solution(int n) {
        String answer = "";
        // n의 크기만큼 짝수번째, 홀수번째를 고려해서 수와 박을 붙여준다.
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) answer += "수";
            if (i % 2 == 0) answer += "박";
        }
        return answer;
    }
}