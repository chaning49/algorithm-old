class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        // signs 배열의 길이만큼 순회하면서 absolutes가 false인 경우 음수로 만들어 더한다.
        for (int i = 0; i < signs.length; i++) {
            if (!signs[i]) answer -= absolutes[i];
            else answer += absolutes[i];
        }
        return answer;
    }
}