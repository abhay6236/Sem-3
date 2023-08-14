import java.util.*;

public class Que2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a limit of array:");
        int n=sc.nextInt();
           int a[]=new int[n];
         int f=-1;
          int r=-1;
          System.out.println("Enter Element:");
          int y=sc.nextInt();
           

            enqueue(a,n,f,r,y);
          
            int ans =dequeue(a,f,r);
            System.out.println(ans);
            display(a);
}

    static void enqueue(int a[],int n,int f,int r,int y){
        if(r==n-1){
            System.out.println("Overflow");
            return;
        }
    
        a[r]=y;
        r++;

        if(f==-1){
            f=0;
        }

    }
    
    static int dequeue(int a[],int f,int r){
        if(f==-1){
            System.out.println("Underflow");
            return 0;
        }
        
        int d=a[f];
        if(f==r){
            f=-1;
            r=-1;
        }
        else {
            f++;
          
        }
        return d;
    
}
static void display(int a[]){
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
}
}

class Queue{
    int f;
    int r;
    int que[];
    Queue(int size){
        this.f=-1;
        this.r=-1;
        que =new int [size] 
    }
}