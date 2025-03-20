import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < n ; i ++){
            queue.offer(i+1);
        }

        boolean flag = true;
        int count = 1;
        String result = "<";
        while(!queue.isEmpty()){
            if(count%k == 0){
                result += queue.poll();
                result += ", ";
                count += 1;
            }else{
                int number = queue.poll();
                queue.offer(number);
                count += 1;
            }
        }
        System.out.println(result.substring(0, result.length()-2) + ">");

    }
}