class Solution {
    public int solution(int n, int a, int b) {
        // 라운드 저장할 변수
        int answer = 0;

        // B가 2가 될 때까지 반복
        while (a != b) {
            // 라운드 증가
            answer++;

            // a와 b의 몫과 나머지를 더하면 다음 번호가 된다.
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
        }
        return answer;
    }
}