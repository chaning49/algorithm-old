class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        // 약수가 홀수 개인 수이면 left부터 right의 합에서 빼준다.
        for (int i = left; i <= right; i++) {
            int cnt = 0;
            // 약수마다 cnt 증가
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            // 약수의 개수가 짝수, 홀수인 경우 연산
            if (cnt % 2 == 0) answer += i;
            else answer -= i;
        }

        return answer;
    }
}