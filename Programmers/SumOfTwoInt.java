class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        // b를 항상 큰 수로 만들어 준다.
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // for문의 범위를 a와 b로 설정하여 그 사이에 위치한 수를 더해준다.
        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}