import java.util.Scanner;
public class TwoDimentionalArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit Array:");
        int n=sc.nextInt();
        int a[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.println("Enter a number:"+i +" "+j);
            a[i][j]=sc.nextInt();
        }
       }

       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(j==0){
                System.out.print(" | "+a[i][j]+" ");
            }
            else if(j==n-1){
                System.out.print(a[i][j]+" | ");
            }
            else{
                System.out.print(a[i][j]+" ");
            }
        
        }
        System.out.println();
   }
      
    }
}