import java.util.*;

public class Main{
    public static void main(String[] args) {
        /*
         * https://www.acmicpc.net/problem/9012
         * 9012번 괄호
         * 
         */
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();

        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < a ; i ++){

           String b = sc.nextLine();
           
           st.clear();
           boolean flag = true;

           for(int j = 0 ; j < b.length() ; j++){ //한 줄에 대한 반복문
            char ch = b.charAt(j);

            flag = true;
            
            if(ch == 40){ //'('
                st.push(ch);
            }else if(ch == 41 && !st.empty()){// ')'
                st.pop();
            }else if(ch == 41 && st.empty()){
                flag = false; //이미 조건 충족 못한 경우
                break;
            }
            
           }

           if(st.empty() && flag){
               System.out.println("YES");
           }else if(!st.empty() || !flag){
               System.out.println("NO");
           }
            
        }

        

    }
}