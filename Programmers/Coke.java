class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (true) {

            // a가 n보다 커지는 순간에는 콜라를 더 받을 수가 없다.
            if (a > n) {
                break;
            }

            // a개로 n을 나눈 몫에 받을 수 있는 빈 병의 개수인 b를 곱한다.
            answer += (n / a) * b;
            // a개로 나눈 n 값 + a개로 나눈 n의 나머지
            n = (n / a) * b + (n % a);
        }

        return answer;
    }
}