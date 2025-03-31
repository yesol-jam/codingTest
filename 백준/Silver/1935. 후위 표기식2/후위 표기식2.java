import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int number = Integer.parseInt(br.readLine());//피연산자의 개수
        StringBuilder sb = new StringBuilder(br.readLine());//후위표기식
        double result = 0;//결과

        int [] intArr = new int[number];//피연산자 대응값
        for(int i = 0 ; i < number ; i ++){
            intArr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Double> st = new Stack<>();
        for(int i = 0 ; i < sb.length() ; i ++){
            char ch = sb.charAt(i);
            int a = 0;
            if(ch >= 65 && ch <= 90){ //A~Z까지 해당 되면
                a = intArr[ch-65];
                st.add(Double.valueOf(a));
            }else{ //연산자이면
                double b = st.pop();
                double c = st.pop();
                double d = 0 ;
                if(ch == 43){ //더하기
                    d = c + b ;
                }else if(ch == 45){//빼기
                    d = c - b;
                }else if(ch == 42){//곱하기
                    d = c * b;
                }else if(ch == 47){//나누기
                    d = c / b;
                }
                st.add(d);
            }
        }
        result = st.pop();
        System.out.printf("%.2f",result);
    }

}
