import java.util.Scanner;
public class SinglyLinkedList{
    public static void main(String[] args) {
        list l1=new list();
    Scanner sc= new Scanner(System.in);


    while(true){
        System.out.println("Enter 1 for insert First,\n ENter 2 for insert last,\nEnter 3 for Display,\n Enter -1 to break");
        int c=sc.nextInt();
        if(c==1){
            System.out.println("Enter a number:");
            int a=sc.nextInt();
            l1.insertF(a);
        }
        else if(c==2){
            System.out.println("Enter a number:");
            int a=sc.nextInt();
            l1.insertE(a);
        }
        else if(c==3){
            l1.display();
        }
        else if(c==-1){
            break;
        }
        else{
            System.out.println("Invalid input:)");
                }
    }
}
    }
    

class Node{
    Node link;
    int info;
    Node(int info){
        this.info=info;
    }
}
class list{
    Node first;
    void insertE(int value){
    if(first==null){
        first=new Node(value);
    }
    else{
        Node temp=first;
            while(temp.link!=null){
                temp=temp.link;
            }
            temp.link=new Node (value);
    }
}


    void insertF(int value){
        if(first==null){
            first=new Node(value);
        }
        else{
            Node x= new Node(value);
            x.link=first;
            first=x;
        }
    }
    void deleteF(int value){
        if(first.link==null){
            System.out.println("LinkedList is null");
        }
        else if(first.link==null){
            Node y=new node;
                y=first;
                return y;
        }
    }

    void display(){
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.info);
            temp=temp.link;
        }
    }
  
}

