class Solution {
    public int solution(int n) {
        String s = Integer.toBinaryString(n);
        int ans = 0;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) { // 이진수에 포함된 1을 센다.
            if (s.charAt(i) == '1') cnt++;
        }

        ans = n + 1;

        while (true) {
            String temp = Integer.toBinaryString(ans);
            int otherCnt = 0;

            for (int j = 0; j < temp.length(); j++) { // n 이후에 나오는 숫자에 포함된 1을 센다.
                if (temp.charAt(j) == '1') otherCnt++;
            }

            if (cnt == otherCnt) {
                break;
            }
            ans++;
        }
        return ans;
    }
}