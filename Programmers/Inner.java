class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        // 인덱스가 같은 a와 b 값을 곱해서 더해주면 된다.
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}