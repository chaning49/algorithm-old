import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Fibo(sc.nextInt()));
    }

    public static int Fibo (int num) {
        if (num == 0) return 0;
        else if (num == 1) return 1;
        return Fibo(num - 1) + Fibo(num - 2);
    }
}