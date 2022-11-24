import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double[score.length];
        int[] rank = new int[score.length];

        // rank 배열 순위를 1로 초기화
        for (int i = 0; i < rank.length; i++) {
            rank[i] = 1;
        }

        // score 배열의 평균 값을 저장
        for (int i = 0; i < score.length; i++) {
            int temp = 0;
            for (int j = 0; j < score[i].length; j++) {
                temp += score[i][j];
            }
            answer[i] = (double) temp / (double) score[i].length;
        }

        // 순위를 만드는 반복문
        for(int i = 0; i < answer.length; i++) {
            // 순위 배열을 for 돌때마다 1등으로 초기화
            rank[i] = 1;
            // 배열 i 인덱스의 점수와 나머지 점수 비교
            for(int j = 0; j < answer.length; j++) {
                // i 인덱스의 값보다 크면 순위 증가
                if(answer[i] < answer[j]) {
                    rank[i] = rank[i] + 1;
                }
            }
        }

        return rank;
    }
}