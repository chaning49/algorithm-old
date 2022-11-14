package com.codestates.coplit;

public class Solution {
    public int[] mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        sort(arr, temp, 0, arr.length - 1);
        return arr;
    }

    public void sort(int[] arr, int[] temp, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2; // 절반의 위치
            sort(arr, temp, start, mid); // 절반 중 왼쪽 부분리스트
            sort(arr, temp, mid + 1, end); // 절반 중 오른쪽 부분리스트
            merge_Sort(arr, temp, start, mid, end); // 병합
        }
    }

    public void merge_Sort(int[] arr, int[] temp, int start, int mid, int end) {
        // TODO :
        for (int i = start; i <= end; i++) {
            temp[i] = arr[i];
        }

        int s = start; // 왼쪽 부분리스트 시작점
        int e = mid + 1; // 오른쪽 부분리스트 시작점
        int idx = start; // 채워넣을 배열의 인덱스
        while (s <= mid && e <= end) {
            // 왼쪽 부분리스트 s번째 원소가 오른쪽 부분리스트의 e번째 원소보다 작으면
            // 왼쪽의 s번째 원소를 새로운 배열에 넣고 s를 1 증가시킨다.
            if (temp[s] <= temp[e]) {
                arr[idx] = temp[s];
                s++;
            }
            // 오른쪽 부분리스트의 e번째 원소가 왼쪽 부분리스트의 s번째 원소보다 작으면
            // 오른쪽의 e번째 원소를 새로운 배열에 넣고 e를 1 증가시킨다.
            else {
                arr[idx] = temp[e];
                e++;
            }
            // if 또는 else 둘 중 하나가 실행될때마다 idx는 증가
            idx++;
            // 앞 쪽 배열에 데이터가 남은 경우, 뒷 쪽 데이터는 그 자리에 그대로 두면 된다.
            for (int i = 0; i <= mid - s; i++) {
                arr[idx + i] = temp[s + i];
            }
        }
    }

}
