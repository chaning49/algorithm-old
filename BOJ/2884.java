import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m < 45) { // m이 45보다 작은 경우 m에 15를 더하면 m값이 된다.
            m += 15;
            if (h > 0) h -= 1; // m이 45보다 작기 때문에 h에서도 1을 줄여야한다.
            else h = 23;
        }
        else m -= 45;
        System.out.println(h + " " + m);
    }
}