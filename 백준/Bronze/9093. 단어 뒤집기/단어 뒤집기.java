import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();

        for(int i = 0 ; i < a ; i ++){

            String b = sc.nextLine();
            String [] arr = b.split(" ");
            
            for(int j = 0 ; j < arr.length ; j++){

                String str = arr[j];

                Stack<Character> stack = new Stack<>();
                for(int k = 0 ; k < str.length() ; k ++){
                    stack.push(str.charAt(k));
                }
                String newString = "";
                for (int k = 0; k < str.length(); k++) {
                    newString += stack.pop();
                }
                str = newString;
                System.out.print(str + " ");
            }
            System.out.println();
        }

        

    }
}