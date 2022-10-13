class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        // numbers 배열의 합을 저장
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) sum += numbers[i];

        // 0부터 9까지의 합인 45에서 numbers 배열의 합을 빼준다.
        answer = 45 - sum;

        return answer;
    }
}