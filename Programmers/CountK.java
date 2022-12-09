class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        // idx 값을 자리수 별로 체크해서 개수를 센다.
        for (int idx = i; idx <= j; idx++) {
            int temp = idx;
            while (temp != 0) {
                if (temp % 10 == k) {
                    answer++;
                    temp /= 10;
                } else {
                    temp /= 10;
                }
            }
        }

        return answer;
    }
}