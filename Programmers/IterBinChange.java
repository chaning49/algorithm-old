class Solution {
    public int[] solution(String s) {
        int[] ans = new int[2];
        while (s.length() > 1) {
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') ans[1]++;
                else cnt++;
            }
            s = Integer.toBinaryString(cnt);
            ans[0]++;
        }
        return ans;
    }
}