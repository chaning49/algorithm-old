class Solution {
    public int solution(int[] common) {
        int answer = 0;

        // 해당되면 등차수열이다.
        if (common[1] - common[0] == common[2] - common[1]) {
            int d = common[1] - common[0];
            answer = common[common.length - 1] + d;
        }

        // 다른 경우는 등비수열이다.
        else {
            int r = common[1] / common[0];
            answer = common[common.length - 1] * r;
        }

        return answer;
    }
}