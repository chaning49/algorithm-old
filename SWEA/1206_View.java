import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;

        for(int t = 1; t <= 10; t++)
        {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> tower = new ArrayList<>();
            while (st.hasMoreTokens()) {
                tower.add(Integer.parseInt(st.nextToken()));
            }
            int view = 0;
            for (int i = 2; i < n - 2; i++) {
                int def_2 = tower.get(i) - tower.get(i - 2);
                int def_1 = tower.get(i) - tower.get(i - 1);
                int def2 = tower.get(i) - tower.get(i + 2);
                int def1 = tower.get(i) - tower.get(i + 1);
                if (def_2 > 0 && def_1 > 0 && def1 > 0 && def2 > 0) {
                    view += Math.min(def1, Math.min(def2, Math.min(def_1, def_2)));
                }
            }
            System.out.printf("#%d %d\n", t, view);
        }
    }
}