import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine()); // 첫 줄 입력

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                queue.offer(Integer.parseInt(command.split(" ")[1]));
            } else if ("pop".equals(command)) {
                sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
            } else if ("size".equals(command)) {
                sb.append(queue.size()).append("\n");
            } else if ("empty".equals(command)) {
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
            } else if ("front".equals(command)) {
                sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
            } else if ("back".equals(command)) {
                sb.append(queue.isEmpty() ? -1 : queue.getLast()).append("\n");
            }
        }

        System.out.print(sb); // 한 번에 출력
    }
}