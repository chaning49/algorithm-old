class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] temp = new int[3];

        // 3개의 수를 하나씩 순회해야 하기 때문에 3중 for문 사용
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) answer++;
                }
            }
        }

        return answer;
    }

    // 소수 판별을 하는 메서드
    public boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}