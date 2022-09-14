import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int cook = sc.nextInt();

        // 음식에 소요되는 시간을 시간과 분으로 구분해서 더해준다.
        h = h + cook / 60;
        m = m + cook % 60;

        // 분이 60 이상이면 시간을 하나 늘려주고 60을 빼준다.
        if (m >= 60) {
            m -= 60;
            h += 1;
        }
        // 시간이 24 이상이면 24를 뺀다.
        if (h >= 24) h -= 24;
        System.out.println(h + " " + m);
    }
}