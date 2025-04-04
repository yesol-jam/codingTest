import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * https://www.acmicpc.net/problem/10808
         * 백준 10808 알파벳 개수
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder(br.readLine());

        int arr[] = new int[26];

        for(int i = 0 ; i < arr.length ; i ++){
            arr[i] = 0 ;
        }

        for(int i = 0 ; i < sb.length() ; i ++){
            char a = sb.charAt(i);
            
            //a = 97이면 a[0] 에 넣어야 함
            arr[a-97] += 1;
        }

        for(int i = 0 ; i < arr.length ; i ++){
            System.out.printf("%d ", arr[i]);
        }

    }

}
