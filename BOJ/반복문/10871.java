import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        while (st1.hasMoreTokens()) {
            list.add(Integer.parseInt(st1.nextToken()));
        }

        br.close();

        for (int l : list) {
            if (l < n) bw.write(l + " ");
        }

        bw.flush();
        bw.close();
    }
}