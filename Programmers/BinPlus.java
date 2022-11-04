class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";

        // 이진수를 십진수로 변환
        int b1 = Integer.valueOf(bin1, 2);
        int b2 = Integer.valueOf(bin2, 2);

        // 둘의 합을 다시 이진수로 변환
        answer = Integer.toBinaryString(b1 + b2);

        return answer;
    }
}