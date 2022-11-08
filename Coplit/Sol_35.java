package com.codestates.coplit;

public class Solution {
    public int[] quickSort(int[] arr) {
        // TODO:
        if (arr.length == 0) return arr;

        int start = 0;
        int end = arr.length - 1;

        return sort(arr, start, end);
    }

    // 재귀함수가 호출되면 배열의 포인터와 스타트, 엔드 파티션을 나눌 범위를 인자로 받는다.
    private static int[] sort(int[] arr, int start, int end) {
        // 해당 배열 방의 시작과 끝 범위 안에서 파티션을 나누고, 나눈 파티션의 오른쪽 방 첫번째 값을 받는다.
        int part = partition(arr, start, end);
        // 오른쪽 방 첫번째 값이 start 다음이라면 왼쪽 파티션의 데이터가 하나라는 뜻이므로 정렬할 필요가 없다.
        // 그래서 값이 하나 이상 차이가 날 때만 함수를 재귀적으로 호출해서 정렬을 시도한다.
        if (start < part - 1) {
            // 왼쪽 파티션이므로 시작점은 같고, 끝 점은 오른쪽 파티션의 시작점 전에 있는 값으로 설정한다.
            sort(arr, start, part - 1);
        }
        // 오른쪽 파티션의 배열방이 하나 이상일 때만 호출해야 하기 때문에 오른쪽 파티의 시작점이 마지막 배열 방보다
        // 작은 경우에만 오른쪽 파티션을 정렬하도록 한다.
        if (part < end) {
            // 오른쪽 파티션이므로 시작점을 오른쪽 파티션의 시작점으로 바꿔주고, 끝 값은 그대로 둔다.
            sort(arr, part, end);
        }

        return arr;
    }

    private static int partition(int[] arr, int start, int end) {
        // 피봇은 배열의 중간 값으로 설정
        int pivot = arr[(start + end) / 2];
        // 시작점이 끝 지점보다 작거나 같은 동안만 반복적으로 양쪽 끝에서 포인트를 한 칸씩 앞으로 옮긴다.
        while (start <= end) {
            // 배열 방의 값이 피봇보다 작으면 무시하고 지나친다.
            while (arr[start] < pivot) start++;
            // 배열 방의 값이 피보보다 크면 무시하고 지나친다.
            while (arr[end] > pivot) end--;
            // start와 end가 서로 지나치기 전에 값을 변경해주고 가던 방향대로 움직이게 만든다.
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // 위 반복문을 start와 end가 지나칠때까지 반복하면 start 포인터의 새로 나눌 오른쪽 파티션에
        return start;
    }
}
