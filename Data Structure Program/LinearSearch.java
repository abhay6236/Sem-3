import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit:");
        int n=sc.nextInt();
        // int  a[]={1,2,3,4,5,6,7,8}
        // int key=5;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter number of Array");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to find Array: ");
        int k=sc.nextInt();
        LinearSearch(a,k,n);
    }

        static void LinearSearch(int a[],int k,int n){
            for(int i=0;i<n;i++){
                if(a[i]==k){
                    System.out.println(k+"index of"+i);
                    return;
                }
            }
            System.out.println("Not Found");
        }
    
    }
