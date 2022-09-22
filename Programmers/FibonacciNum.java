class Solution {
    public int solution(int n) {
        int[] fibo = new int[n + 1];
        int answer = 0;

        for (int i = 0; i <= n; i++) {
            if (i <= 1) fibo[i] = i;
            else fibo[i] = (fibo[i - 2] + fibo[i - 1]) % 1234567;
        }
        return fibo[n];
    }
}