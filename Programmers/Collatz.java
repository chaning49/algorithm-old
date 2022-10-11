class Solution {
    public int solution(int num) {
        // num이 1이면 0 반환
        if (num == 1) return 0;

        // 최대 반복횟수 500회를 체크할 변수 선언
        int cnt = 0;
        // 반복문으로 num = 1이 될 때까지 반복
        while (num > 1) {
            // cnt를 증가
            cnt++;
            // 짝수인 경우
            if (num % 2 == 0) num = num / 2;
                // 홀수인 경우
            else if (num % 2 == 1) num = num * 3 + 1;
        }

        if (num == 1) return cnt;
        else return -1;
    }
}