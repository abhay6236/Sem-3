import java.util.Scanner;
public class Ds_9_47{
    public static void main(String[] args) {
       Llist l1=new Llist();
        

        while(true){
            System.out.println("Enter 1 for insert at end,\n Enter 2 for insert at front,\nEnter 3 for delete at front,\nEnter 4 for delete at end ,\nEnter 5 fot specified position for delete,\nEnter 6 for Display  for all Element a Node,\nENter -1 to end:");
        Scanner sc=new Scanner(System.in);
        int c = sc.nextInt();
        if(c==1){
            System.out.println("Enter a number:");
            int b=sc.nextInt();
            l1.insertL(b);
        }
        else if(c==2){
            System.out.println("Enter a number:");
            int b=sc.nextInt();
            l1.insertF(b);
        }
        else if(c==3){
            Node b=l1.deleteF();
            System.out.println(b.info);
        }
        else if(c==4){
           Node b= l1.deleteE();
            System.out.println(b.info);
        }
        else if(c==5){

            System.out.println("Enter a position:");
            int b=sc.nextInt();
            if(l1.count<b){
                System.out.println("Enter invalid input:");
            }
            else{
            Node d=l1.deleteSP(b);
            System.out.println(d.info);
            }
        }
        else if(c==6){
            
            l1.Dispaly();
        }
        else if(c==-1){
            break;
        }
        else{
            System.out.println("Invalid input:");
        }
    }

        

     
    }
}
 class Node{
        int info;
        Node link;
        // Node head;
        Node(int info){
            this.info=info;
     }
     void print(){
        System.out.println(info+""+link);
     }
    }

    class Llist{
        Node head;
        int count;
     void insertL(int value){
        count++;
        if(head==null){
            head=new Node(value);
        }
        else{
                Node temp = head;
                while(temp.link!=null){
                    temp=temp.link;
                }
                temp.link = new Node(value);
        }
}
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

 Node deleteF(){
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
        Node x =  head;
        head=head.link;
        return x;
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

 Node deleteSP(int i){
    count--;
    if(head.link==null){
        System.out.println("Linklist is null:)");
        return null;
    }
   
    else{
        Node temp=head;
        int y=0;
        while(temp!=null){
            temp=temp.link;
            y++;
        }
        if(y>=i){
            temp=head;
            Node predeceser=head;
            int j=1;
            while(j<=i){
                predeceser=temp;
                temp=temp.link;
                j++;
            }
            predeceser.link=null;
            return temp;
            
             
        }
        else{
            System.out.println("Linked List is smaller than specified:");
            return null;
        }
        
        
        
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
