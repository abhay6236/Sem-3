import java.util.Scanner;

public class CircularQue{
    public static void main(String[] args) {
        int f=-1,r=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a limit:");
        int n=sc.nextInt();
        circular cr=new circular(n);
        while(true){
        System.out.println("Enter 1 for insert,enter 2 for delete,enter 3 for display,enter -1 for end:");
         int d=sc.nextInt();

            if(d==1){
                System.out.println("Enter a element:");
                int y=sc.nextInt();
                cr.cqinsertque(y);
            }
            else if(d==2){
              int e=  cr.cqdeleteque();
              System.out.println(e);
            }
            else if(d==3){
                cr.display();
            }
            else{
                break;
            }
        }

    }
}

class circular{
    int[] a;
    int f;
    int r;
    circular(int size){
        a=new int[size];
        f=-1;
        r=-1;
    }
    public void cqinsertque(int n){

        if(r==(a.length-1)){
            r=0;
            
        }
        else{
            r=r+1;
        }
        if(r==f){
            System.out.println("over flow");
            r=a.length-1;
            return;
        }
        a[r]=n;
        if(f==(-1)){
            f=0;
        }

       }

       public int cqdeleteque(){
        if(f==(a.length-1)){
            System.out.println("underflow:");
            return 0;
        }

        int y=a[f];

        if(f==r){
            f=-1;
            r=-1;
        }
        else if(f==(a.length-1)){
            f=0;
        }
        else{
            f++;
        }
        return y;
       }

       public void display(){
        if(f==(-1)  && r==(-1)){
            System.out.println("empty queue:");
            return;
        }      
        int flag=0;
        for(int i=f;i<a.length;i++){
            System.out.println(a[i]);
            if(i==r)
            {
              flag++;
              break;  
            }
        }
        if(flag==0){
            for(int i=0;i<=r;i++){
                System.out.println(a[i]);
            }

        }

       }
}