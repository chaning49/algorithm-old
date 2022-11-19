class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        // 일반적으로 분수의 합을 구하는 분자와 분모를 나눠서 계산(약분을 하지 않은 상태)
        int top = denum1 * num2 + denum2 * num1;
        int bottom = num1 * num2;

        // 구한 값을 가지고 최대 공약수를 만들어준다.
        int result = gcd(top, bottom);

        // 최대 공약수로 분자와 분모를 나눈 값이 정답(약분)
        answer[0] = top / result;
        answer[1] = bottom / result;

        return answer;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}