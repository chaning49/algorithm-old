import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.add(i);

        br.close();

        while (true) {
            if (queue.peek() == null) break;
            ans.add(queue.poll());
            queue.add(queue.poll());
        }

        bw.write(ans.toString().replace("[", "").replace(",", "").replace("]", ""));
        bw.flush();
        bw.close();
    }
}