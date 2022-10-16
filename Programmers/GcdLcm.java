class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 큰 값과 작은 값의 순서를 맞추기 위해 따로 저장
        int maxNum = Math.max(n, m);
        int minNum = Math.min(n, m);
        // 최대공약수를 구하고, 최소공배수는 두 수를 곱한 값을 gcd로 나눈 것이기 때문에 계산해준다.
        answer[0] = gcd(maxNum, minNum);
        answer[1] = n * m / answer[0];
        return answer;
    }
    // 최대공약수를 구하는 재귀함수
    public int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}