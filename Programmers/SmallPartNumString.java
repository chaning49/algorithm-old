class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        // p의 int 값 저장
        long pNum = Long.parseLong(p);

        // t, p의 길이를 저장한다.
        int tLen = t.length();
        int pLen = p.length();

        // t의 첫번째 인덱스부터 p의 길이만큼 하나씩 움직여가면서 p의 값과 비교한다.(반복 횟수는 t의 길이 - p의 길이 + 1)
        // 이 때, p보다 작거나 같은 수가 있으면 answer++
        for (int i = 0; i < tLen - pLen + 1; i++) {
            // substring으로 잘라낸 값을 int 타입으로 변환해서 비교
            long temp = Long.parseLong(t.substring(i, pLen + i)); // int는 런타임 에러가 생긴다. 값의 표현범위를 넘어서는 케이스가 있기 때문
            if (temp <= pNum) answer++;
        }

        return answer;
    }
}