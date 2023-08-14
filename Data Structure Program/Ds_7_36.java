import java.util.*;

public class Ds_7_36{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        String a=sc.nextLine();
        Stack<Double> s=new Stack<>();

            for(int i=0;i<a.length();i++){
                char next=a.charAt(i);
         

            if(Character.isLetterOrDigit(next)){
                s.push((double)Character.getNumericValue(next));

            }
            else{

                Double x=s.pop();
                Double y=s.pop();
                    switch (next) {


                        case '+':
                        s.push(x+y);
                        break;

                        case '-':
                        s.push(x-y);
                        break;

                        case '/':
                        s.push(x/y);
                        break;


                        case '*':
                        s.push(x*y);
                        break;


                        case '^':
                        s.push(Math.pow(y,x));
                        break;

                    }
            }
        }
        System.out.println(s.pop());

    }
}