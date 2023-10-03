public class Ds_9_46{
    public static void main(String[] args) {
       Llist l1=new Llist();
       l1.insert(10);
       l1.insert(0);
       l1.insert(50);
       l1.insert(8);  
       l1.Dispaly();
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
        void insert(int value){
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
void Dispaly(){
    Node temp=head;
    while(temp!=null){

        System.out.println(temp.info);
        temp=temp.link;
    }
}

}
