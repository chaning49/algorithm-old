package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int primePassword(int curPwd, int newPwd) {
        // TODO:
        int answer = 0;
        // 만약 같은 값이 입력됐다면 0 리턴
        if (curPwd == newPwd) return answer;
        // 동작의 횟수와 4자리 curPwd를 저장할 큐 선언
        Queue<int[]> queue = new LinkedList<> ();

        // 방문한 숫자를 표시하기 위한 배열, 숫자가 4자리이므로 10000까지만 사이즈를 정해주면 된다.
        boolean[] isVisited = new boolean[10000];
        // 처음으로 입력된 수인 curPwd를 방문으로 표시 후 큐에 동작의 횟수인 0과 curPwd를 삽입
        isVisited[curPwd] = true;
        queue.offer(new int[] {0, curPwd});

        // 큐에 값이 있는 동안 반복
        while (!queue.isEmpty()) {
            // 큐에 있는 값을 필요에 따라 나눠서 저장
            int[] data = queue.poll();
            int result = data[0];
            int num = data[1];

            // 4자리 숫자이므로 인덱스 0~3까지만 순회
            for (int i = 0; i < 4; i++) {
                // 숫자를 자리별로 나눠서 배열에 하나씩 저장
                int[] digits = splitNumber(num);
                // 자릿수를 하나씩 증가시키면서 값을 맞춰준다.
                for (int d = 0; d < 10; d++) {
                    // 해당 자릿수와 다른 숫자인 경우에만 실행
                    if (d != digits[i]) {
                        // 해당 자릿수를 바꿔준 후 나눠져있는 배열을 하나로 합쳐서 temp에 저장
                        digits[i] = d;
                        int temp = makeDigits(digits);
                        // 만약 목표값과 같다면 동작의 횟수를 하나 증가시키면서 반환
                        if (temp == newPwd) return result + 1;
                        // 목표값은 아니지만 1000보다 크고, 소수이고, 방문한 적이 없는 값이면 방문으로 바꿔준 뒤 동작 횟수를 증가시키고, 해당 숫자를 큐에 저장
                        if (temp > 1000 && isPrime(temp) && isVisited[temp] == false) {
                            isVisited[temp] = true;
                            queue.offer(new int[] {result + 1, temp});
                        }
                    }
                }
            }
        }
        // while문을 전부 순회했는데도 반환되지 않았다면 없는 것이므로 -1
        return -1;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int[] splitNumber(int num) {
        String temp = Integer.toString(num);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp.charAt(i) - '0';
        }
        return digits;
    }

    public int makeDigits(int[] arr) {
        String[] tempArr = new String[arr.length];
        for(int i = 0; i < arr.length; i++) {
            tempArr[i] = String.valueOf(arr[i]);
        }
        return Integer.parseInt(String.join("", tempArr));
    }
}