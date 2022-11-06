class Solution {
    public int solution(int n) {
        int answer = 0;
        // 3, 6, 9, 12, 13, 15
        // 3의 배수와 3이 포함된 숫자는 지나친다!
        for (int i = 1; i <= n; i++) {
            answer += 1;
            while (Integer.toString(answer).contains("3") || answer % 3 == 0) {
                answer += 1;
            }
        }
        return answer;
    }
}