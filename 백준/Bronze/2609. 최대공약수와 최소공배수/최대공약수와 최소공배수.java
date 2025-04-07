import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * https://www.acmicpc.net/problem/2609
         * 최대공약수와 최소공배수
         */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//36
        int b = sc.nextInt();//28
        int result1 = 0 ;
        int result2 = a*b ;

        while(a%b != 0){
            int c = a%b;
            a = b;
            b = c;
        }

        result1 = b;
        result2 = result2 / b;
        

        System.out.println(result1);
        System.out.println(result2);
        


    }

}