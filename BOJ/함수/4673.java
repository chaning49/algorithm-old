public class Main {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int num = d(i);

            if (num < 10001) {
                arr[num] = true;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }

    static int d(int n) {
        int temp = n;
        while (n != 0) {
            temp += n % 10;
            n /= 10;
        }
        return temp;
    }
}