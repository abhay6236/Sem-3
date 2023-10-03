import java.util.Scanner;

public class SelectionSort{
    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
        int a[]={2,9,8,5,15,4,7,12,11,10};
        

        for(int i=0;i<a.length-1;i++){
            int small=i;
            for(int j=i+1;j<a.length;j++){
               if(a[j]<a[small]){
                 small=j;
               }
              
            }
            int temp=a[small];
            a[small]=a[i];
            a[i]=temp;
        }

        for(int i:a){
            System.out.print(i+",");
        }
    }
}