import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 빠른 출력을 위한 StringBuilder

        int a = Integer.parseInt(br.readLine()); // 숫자 입력
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < a; i++) {
            String command = br.readLine(); // 한 줄 입력

            if (command.startsWith("push_front")) {
                deque.addFirst(Integer.parseInt(command.split(" ")[1]));
            } else if (command.startsWith("push_back")) {
                deque.addLast(Integer.parseInt(command.split(" ")[1]));
            } else if (command.equals("pop_front")) {
                sb.append(deque.isEmpty() ? "-1\n" : deque.poll() + "\n");
            } else if (command.equals("pop_back")) {
                sb.append(deque.isEmpty() ? "-1\n" : deque.pollLast() + "\n");
            } else if (command.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(deque.isEmpty() ? "1\n" : "0\n");
            } else if (command.equals("front")) {
                sb.append(deque.isEmpty() ? "-1\n" : deque.getFirst() + "\n");
            } else if (command.equals("back")) {
                sb.append(deque.isEmpty() ? "-1\n" : deque.getLast() + "\n");
            }
        }

        System.out.print(sb.toString()); // 한 번에 출력
    }
}