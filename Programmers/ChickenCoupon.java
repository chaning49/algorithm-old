// 반복문
class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        while (chicken / 10 != 0) {
            // 쿠폰의 개수로 주문할 수 있는 치킨 수 더하기
            answer += chicken / 10;
            // 주문할 수 있는 치킨의 수 + 남는 쿠폰
            chicken = chicken / 10 + chicken % 10;
        }
        return answer;
    }
}

// 재귀
class Solution {
    public int solution(int chicken) {
        return Coupon(chicken);
    }

    public static int Coupon(int chicken) {
        if (chicken / 10 == 0) return 0;
        return chicken / 10 + Coupon(chicken / 10 + chicken % 10);
    }
}