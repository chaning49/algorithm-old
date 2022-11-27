class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] nephew = {"aya", "ye", "woo", "ma"};

        // 조카가 할 수 있는 네 가지 발음이 babbling에 포함되어 있으면 *로 변경해준다.
        for (int i = 0; i < nephew.length; i++) {
            for (int j = 0; j < babbling.length; j++) {
                if (babbling[j].contains(nephew[i])) babbling[j] = babbling[j].replace(nephew[i], "*");
            }
        }

        // *로 된 부분을 공백으로 치환한다.
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("*", "");
        }

        // 공백의 개수만 세주면 정답이다.
        for (String b : babbling) {
            if (b.equals("")) answer++;
        }

        return answer;
    }
}