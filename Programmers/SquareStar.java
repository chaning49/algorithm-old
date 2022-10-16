import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 행이 3개, 열이 5개이므로 행 하나에 b개의 별이 찍히도록 한다.
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            // 별이 찍힌 후에는 줄 바꿈
            System.out.println();
        }
    }
}