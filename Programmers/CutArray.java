class Solution {
    public String[] solution(String my_str, int n) {
        int resultCnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[resultCnt];

        // substring으로 글자를 하나씩 잘라서 answer 배열에 넣어준다.
        for (int i = 0; i < answer.length; i++) {
            int front = i * n;
            int end = front + n >= my_str.length() ? my_str.length() : front + n;
            answer[i] = my_str.substring(front, end);
        }
        return answer;
    }
}