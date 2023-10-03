import java.util.Scanner;
public class Ds_9_50{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        Llist l1=new Llist();
        while(true){
            System.out.println("Enter 1 for push,\nEnter 2 for delete front,\nEnter 3 for display,\nEnter -1 for end:");

            Scanner sc=new Scanner(System.in);
            int c = sc.nextInt();
            if(c==1){
            System.out.println("Enter a number:");
            int b=sc.nextInt();
            l1.push(b);
            }
            else if(c==2){
            Node b= l1.deleteE();
            System.out.println(b.info);
            }
            else if(c==3){
                l1.display();
            }
            else if(c==-1){
                break;
            }
            else{
                System.out.println("Invalid input");
            }
        }
    }
}
class Llist{
    Node head;
    int count;
void insertF(int value){
    count++;
    if(head==null){
        head=new Node(value);
    }
    else{
        Node n = new Node(value);
        n.link=head;
        head=n;
    }
 }

 Node deleteE(){
    if(head.link==null){
        System.out.println("Linklist is null:)");
        return null;
    }
    else if(head.link==null){
        count--;
        Node x=head;
        head=null;
        return x;
    }
    else{
        count--;
        Node temp=head;
        Node predeceser=head;
        while(temp.link!=null){
            predeceser=temp;
            temp=temp.link;
        }
        predeceser.link=null;
        return temp;
        
    }


 }

 void Dispaly(){
    Node temp=head;
    while(temp!=null){

        System.out.println(temp.info);
        temp=temp.link;
    }
}
}
