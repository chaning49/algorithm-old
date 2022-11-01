class Solution {
    public int solution(int[] numbers, int k) {
        // 시작하는 위치부터 횟수를 세기 때문에 전체 반복수에서 하나를 빼고 2씩 증가
        // 그래서 첫 번째 횟수를 제외한 나머지 개수 x 2를 해준 값을 numbers 배열의 길이로 나눈 나머지가 구하고자 하는 값의 인덱스이다.
        int idx = (k - 1) * 2 % numbers.length;
        return numbers[idx];
    }
}