import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        Stack<Integer> st = new Stack();
        
        for(int i = 0 ; i < num_list.length ; i ++){
            
            st.push(num_list[i]);
            
        }
        
        for(int j = 0 ; j < num_list.length ; j ++){
            
            answer[j] = st.pop();
        }
        
        return answer;
    }
}