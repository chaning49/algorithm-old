package com.codestates.coplit;

public class Solution {
    public int binarySearch(int[] arr, int target) {
        // TODO:
        // 시작 인덱스와 끝 인덱스 값 정하기
        int start = 0;
        int end = arr.length - 1;

        // 시작 인덱스가 끝 인덱스보다 커지면 while문 탈출
        while (start <= end) {
            // 중간 인덱스를 설정
            int mid = (start + end) / 2;
            // 값이 target과 같아지면 mid 인덱스 반환
            if (arr[mid] == target) return mid;
            // 찾는 값이 왼쪽에 위치한 경우
            if (arr[mid] > target) end = mid - 1;
                // 찾는 값이 오른쪽에 위치한 경우
            else start = mid + 1;
        }
        return -1;
    }
}
