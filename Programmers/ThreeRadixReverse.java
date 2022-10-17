class Solution {
    public int solution(int n) {
        int answer = 0;
        // 3진수로 변환
        String threeNum = Integer.toString(n, 3);

        // 3진수의 길이를 저장
        int len = threeNum.length();

        // 맨 끝 인덱스부터 역순으로 만든다.
        String reverse = "";
        for (int i = len - 1; i >= 0; i--) {
            reverse += threeNum.charAt(i);
        }
        // 3진수를 10진수로 변환한다.
        return Integer.parseInt(reverse, 3);
    }
}