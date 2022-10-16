class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        // 반복문을 count 수만큼 순회하면서 price * count한 값을 더한다.
        for (int i = 1; i <= count; i++) {
            answer += i * price;
        }

        return answer - money >= 0 ? answer - money : 0;
    }
}