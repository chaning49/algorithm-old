import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 학생 30명이 과제를 했는지 안했는지 판별할 배열 선언
        boolean[] isPerform = new boolean[31];

        // 입력된 인덱스에 해당하는 경우 true로 값 변경
        for (int i = 0; i < 28; i++) {
            int idx = sc.nextInt();
            isPerform[idx] = true;
        }

        // false인 값의 경우 출력
        for (int i = 1; i < 31; i++) {
            if (!isPerform[i]) System.out.println(i);
        }
    }
}