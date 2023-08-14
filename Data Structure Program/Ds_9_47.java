public class Ds_9_46{
    public static void main(String[] args) {
        Llist l = new Llist();
        System.out.println("Enter 1 for insert at front,\n 2 for insert at last,\n 3 for delete at front ,\n 4 for delete at last,\n 5 for insert at specified position,\n 6 for display ,\n -1 for end")
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt
    }
}
class Node{
    int info;
    Node link;
    Node(int info){
        this.info = info;
    }
}
class Llist{
    Node head;
    void insertE(int value){
        if(head == null){
            head = new Node(value);
        }
        else{
            Node temp = head;
            while(temp.link!=null){
                temp = temp.link;
            } 
            temp.link= new Node(value);
        }
    }
    void insertF(int value){
        if(head == null){
            head = new Node(value);
        }
        else{
            Node n = new Node(value);
            n.link = head;
            head = n;
        }
    }
    Node deleteF(){
        if(head == null){
            System.out.println("linked list is empty:");
            return null; 
        }
        else if(head.link == null){
            Node x = head;
            head = null;
            return x;
        }
        else{
            Node x = head;
            head = head.link;
            return x;
        }
    }
    Node deleteE(){
        if(head == null){
            System.out.println("linked list is empty:"); 
            return null;
        }
        else if(head.link == null){
            Node x = head;
            head = null;
            return x;
        }
        else{
            Node temp = head;
            Node pre;
            while(temp!=null){
                pre=temp;
                temp = temp.link;
            }
            pre.link=null;
            return temp;
        }
    }
    Node deleteI(int i){
        if(head == null){
            System.out.println("linked list is empty:"); 
            return null;
        }
        else if(head.link == null){
            Node x = head;
            head = null;
            return x;
        }
        else{
            Node temp = head;
            Node pre;
            int j=1;
            while(j<=i){
                pre=temp;
                temp = temp.link;
                j++;
            }
            pre.link=temp.link;
            return temp;
        }
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.info);
            temp = temp.link;
        }
    }
}
