package com.codestates.coplit;

public class Solution {
    public String spiralTraversal(Character[][] matrix) {
        // 각 방향마다 row와 col의 변화를 저장
        int[] RIGHT = new int[]{0, 1};
        int[] DOWN = new int[]{1, 0};
        int[] LEFT = new int[]{0, -1};
        int[] UP = new int[]{-1, 0};

        // 각 방향을 위한 lookup table, 순회해야 하는 방향이 우-하-좌-상 순서로 반복되기 때문에 순서대로 넣어준다.
        int[][] MOVES = new int[][]{
                RIGHT, DOWN, LEFT, UP
        };

        int M = matrix.length;
        int N = matrix[0].length;

        int cnt = 0;
        int row = 0, col = -1;
        int direction = 0;
        StringBuilder result = new StringBuilder();

        // cnt는 행렬의 전체 크기만큼 증가
        while (cnt < M * N) {
            // 순회할 방향을 설정
            int[] move = MOVES[direction];
            int rd = move[0], cd = move[1];

            row = row + rd;
            col = col + cd;
            // 행 또는 열이 끝날때까지 값을 이어붙여준다.
            while (isValid(row, col, M, N) && matrix[row][col] != null) {
                result.append(matrix[row][col]);
                matrix[row][col] = null;
                row = row + rd;
                col = col + cd;
                cnt++; // 2차원 배열에서 순회한 원소의 개수만큼 증가
            }
            // row, col 이 행렬의 범위를 벗어났기 때문에,
            // 진행된 방향의 반대로 한 칸 이동한다.
            row = row - rd;
            col = col - cd;

            // 각 방향이 순환되기 때문에 모듈러 연산을 사용한다.
            direction = (direction + 1) % 4;
        }
        return result.toString();
    }

    // row와 col이 정해진 범위 내에 있는지 확인
    public boolean isValid(int row, int col, int M, int N) {
        return (row >= 0 && row < M && col >= 0 && col < N);
    }
}
