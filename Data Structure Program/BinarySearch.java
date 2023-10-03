import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit:");
        int n=sc.nextInt();
        // int  a[]={1,2,3,4,5,6,7,8}
        // int key=5;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter sorted number of Array");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to find Array: ");
        int k=sc.nextInt();
        int d=BinarySearch(a,k,0,n);
        if(d!=-1){
            System.out.println(k+"Fount at "+d);
        }
        else{
            System.out.println("Not Found");
        }
    }

        static int BinarySearch(int a[],int k,int n,int s){
            if(a[(s+n)/2]>k){
                return BinarySearch(a,k,s,(s+n)/2);
            }
            else if(a[(s+n)/2]<k){
                return BinarySearch(a,k,(s+n)/2+1,n);
            }
            else if(a[(s+n)/2]==k){
                return (s+n)/2;
            }
            return -1;





        }
    
    }
