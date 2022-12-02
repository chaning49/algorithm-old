class Solution {
    public int solution(int num, int k) {
        int answer = 0;

        // num을 문자열 형태로 저장
        String temp = Integer.toString(num);
        // 문자열에 없으면 -1
        if (!temp.contains(Integer.toString(k))) return -1;
            // 있는 경우, 인덱스 + 1 반환
        else answer = temp.indexOf(Integer.toString(k)) + 1;

        return answer;
    }
}