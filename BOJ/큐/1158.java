import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.add(i);

        int cnt = 1;

        while (!queue.isEmpty()) {
            if (cnt == k) {
                ans.add(queue.poll());
                cnt = 1;
            }
            else {
                queue.add(queue.poll());
                cnt++;
            }
        }
        System.out.println(ans.toString().replace("[", "<").replace("]", ">"));
    }
}