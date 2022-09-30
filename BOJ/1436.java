import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int tripleSix = 666;
        while (true) {
            if (Integer.toString(tripleSix).contains("666")) {
                cnt++;
            }
            if (n == cnt) {
                System.out.println(tripleSix);
                break;
            }
            tripleSix++;
        }
    }
}