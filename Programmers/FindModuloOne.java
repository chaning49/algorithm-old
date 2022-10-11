class Solution {
    public int solution(int n) {
        int answer = 0;

        // 반복문을 순회하면서 작은 수부터 찾는다.
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}