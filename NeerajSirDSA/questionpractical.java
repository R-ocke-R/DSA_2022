// package NeerajSirDSA;
// // BCSC 0805 subject code
// public class questionpractical {
    
// }
import java.util.*;

import javax.lang.model.util.ElementScanner14;
class hEllo{
    public static void main(String[] args){
        Stack <Character> st= new Stack<>();
        String s= new Scanner (System.in).next();
        for (int i = 0; i < s.length(); i++) {
            if(st.isEmpty())
            st.push(s.charAt(i));
            else if(s.charAt(i)==st.peek())
            st.pop();
            else
            st.push(s.charAt(i));
        }
        StringBuilder as= new StringBuilder("");
        while(!st.isEmpty()){
            as.append(st.pop());

        }
        as.reverse();
        System.out.println(as);
        }
    }
}