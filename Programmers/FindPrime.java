class Solution {
    public int solution(int n) {
        int answer = 0;
        // 소수가 아니면 0, 소수이면 1을 반환하므로 answer에 더해주면 됩니다.
        for (int i = 2; i <= n; i++) {
            answer += isPrime(i);
        }
        return answer;
    }
    // 소수 판별 메서드 isPrime
    // 입력된 num에 sqrt를 사용하여 시간 복잡도를 줄일 수 있습니다.
    // i <= Math.sqrt(num)를 i*i <= num으로 표현할 수도 있습니다.
    public int isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return 0;
        }
        return 1;
    }
}