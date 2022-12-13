import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // 8개의 수만을 가지고 비교하므로 1~8까지의 값을 비교하면 된다.
        if (str.equals("1 2 3 4 5 6 7 8")) System.out.println("ascending");
        else if (str.equals("8 7 6 5 4 3 2 1")) System.out.println("descending");
        else System.out.println("mixed");
    }
}