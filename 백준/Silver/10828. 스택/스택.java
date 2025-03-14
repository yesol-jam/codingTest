import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < a+1 ; i ++){
            String b = sc.nextLine();

            if(b.contains(" ")){
                String arr[] = b.split(" ");
                int x = Integer.parseInt(arr[1]);
                stack.push(x);
            }else if(b.equals("pop")){
                System.out.println(stack.empty() ? -1 : stack.pop());
            } else if (b.equals("size")) {
                System.out.println(stack.size());
            } else if (b.equals("empty")) {
                System.out.println(stack.empty()?1:0);
            } else if (b.equals("top")) {
                System.out.println(stack.empty() ? -1 : stack.peek());
            }
        }

        

    }
}