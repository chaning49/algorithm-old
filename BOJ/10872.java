import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }

    public static int Factorial (int num) {
        if (num == 0) return 1;
        return num * Factorial(num - 1);
    }
}