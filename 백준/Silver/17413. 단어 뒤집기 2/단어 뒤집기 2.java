import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * https://www.acmicpc.net/problem/10866
         * 백준 17413 단어뒤집기2
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String message = br.readLine();

        StringBuilder sb = new StringBuilder(message);
        StringBuilder result = new StringBuilder();
        boolean tagStart = false;
        Stack<Character> stack = new Stack<>(); 

        for(int i = 0 ; i < sb.length() ; i ++ ){

            if(sb.charAt(i) == '<'){
                if(!stack.empty()){
                    while(!stack.empty()){
                        result.append(stack.pop());
                    }
                }
                result.append(sb.charAt(i));
                tagStart = true;
            }else if(sb.charAt(i) == '>'){
                result.append(sb.charAt(i));
                tagStart = false;
            }else{ //태그문이 아닐 경우
                if(tagStart){ //태그 안에 있는 경우
                    result.append(sb.charAt(i));
                }else if(!tagStart && sb.charAt(i) != ' '){
                    stack.add(sb.charAt(i));
                }else if(!tagStart && sb.charAt(i) == ' '){
                    if (!stack.empty()) {
                        while (!stack.empty()) {
                            result.append(stack.pop());
                        }
                    }
                    result.append(sb.charAt(i));
                }
            }

        }
        while (!stack.empty()) {
            result.append(stack.pop());
        }
        
        bw.write(result.toString());
        bw.flush();
        bw.close();

    }
}