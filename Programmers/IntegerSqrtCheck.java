class Solution {
    public long solution(long n) {
        long answer = 0;

        // n의 제곱근을 구하기 위해 sqrt를 사용하여 n을 temp에 담아준다.
        double temp = Math.sqrt(n);

        // temp의 제곱이 n과 같으면 temp 값에 1을 더한 후 제곱한다.
        if ((long) temp * (long) temp == n) {
            answer = (long) (temp + 1) * (long) (temp + 1);
            return answer;
        }
        // 아니면 -1
        else return -1;
    }
}