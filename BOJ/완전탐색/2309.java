import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 9명 키의 합
        int sum = 0;
        // 9명의 키를 입력받는 배열
        int[] height = new int[9];
        for (int i = 0; i < 9; i++) {
            height[i] = sc.nextInt();
            sum += height[i];
        }
        // 오름차순으로 정렬
        Arrays.sort(height);
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                // sum에서 두 개의 수를 빼줬을 때, 100이라면 해당 배열에 위치한 수를 0으로 바꿔주고 새로 정렬
                if (sum - height[i] - height[j] == 100) {
                    height[i] = 0;
                    height[j] = 0;
                    Arrays.sort(height);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(height[k]);
                    }
                    return;
                }
            }
        }
    }
}