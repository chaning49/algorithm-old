// 제가 작성한 코드(정답 아님)
package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int[][] rotateMatrix(int[][] matrix, int K) {
        // TODO:
        if (matrix == null || matrix.length == 0) return matrix;

        // K의 회전 수를 저장
        K %= 4;

        return rotation(matrix, K);
    }

    public int[][] rotation(int[][] matrix, int K) {
        if (K == 0) return matrix;

        int len = matrix.length;

        int[][] tempMatrix = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                tempMatrix[i][j] = matrix[len - 1 - j][i]; // 0, 0 -> 3, 0 // 0, 1 -> 2, 0 // 0, 2 -> 1, 0 // 0, 3 -> 0, 0
            }
        }
        return rotation(tempMatrix, K - 1);
    }
}

// 찾아낸 정답 코드
package com.codestates.coplit;
        import java.util.*;

public class Solution {
    public int[][] rotateMatrix(int[][] matrix, int K) {
        // TODO:
        if (matrix == null || matrix.length == 0) return matrix;

        K %= 4;

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] answer;

        switch(K) {
            case 1:
            case 3:
                answer = new int[m][n];
                break;
            case 2:
                answer = new int[n][m];
                break;
            default:
                throw new IllegalArgumentException();
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                switch (K) {
                    case 1:
                        answer[i][j] = matrix[n - 1 - j][i];
                        break;
                    case 2:
                        answer[i][j] = matrix[n - 1 - i][m - 1 - j];
                        break;
                    case 3:
                        answer[i][j] = matrix[j][m - 1 - i];
                        break;
                }
            }
        }

        return answer;
    }
}
