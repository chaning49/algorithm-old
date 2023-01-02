class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] tsn = {'3', '6', '9'};
        String od = Integer.toString(order);

        for (char s : tsn) {
            for (int i = 0; i < od.length(); i++) {
                if (s == (od.charAt(i))) {
                    answer++;
                }
            }
        }

        return answer;
    }
}