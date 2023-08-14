import java.util.Scanner;
import java.util.Stack;

public class Ds_6_33{
  
          static int precedance(char ch){
                switch (ch) {
                    case '+':
                    case '-':
                    return 1;

                    case '/':
                    case '*':
                    return 2;

                    // case "$":
                    case '^':
                    return 3;
                        
                    }
                    return-1;
             }

             static String convert(String a){
                String ans= new String("");
                Stack<Character> s=new Stack<>();


                for(int i=0;i<a.length();i++){
                    char b=a.charAt(i);
                    if(Character.isLetterOrDigit(b)){
                        ans += b;
                        //System.out.println(b)
                    }

                    else if(b =='('){
                        s.push(b);
                    }
                    else if(!s.isEmpty() && (s.peek()=='^' && b=='^')){
                        s.push(b);
                    }
                    else if(b ==')'){
                        while(!s.isEmpty() && s.peek()!= '(')
                            ans += s.pop();
                      
                            s.pop();
                        }
                        else{
                        while (!s.isEmpty() && precedance(b) <= precedance(s.peek())){
                            ans += s.pop();
                        }
                            s.push(b);
                    }
                    }

                
                while (!s.isEmpty()){
                    if(s.peek() == '(')
                        return "Invalid Expression";
                    ans += s.pop();
                 }
                return ans;
            }
    
             

    
            public static void main(String[] args) 
            {
                String exp = "(A^B^C)";
                System.out.println(convert(exp));
            }
        }