import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class Que{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();  

        System.out.println("Enter a number for queue:");
        int n=sc.nextInt();

        queue.add(n);
        System.out.println(queue);
        queue.remove();


        System.out.println(queue);

    }
}