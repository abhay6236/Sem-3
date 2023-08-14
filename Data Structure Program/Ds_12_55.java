import java.util.Scanner;

public class Ds_12_55 {

  public static void main(String[] args) {
    dbList db1=new dbList();
    Scanner sc=new Scanner(System.in);
    while(true){
        System.out.println("Enter 1 for insert first,\nEnter 2 for insert last,\nEnter 3 for delete specify posotion,\nEnter 4 for display,\nEnter -1 to END");
        int c=sc.nextInt();
        if(c==1){
            System.out.println("Enter a number:");
            int b=sc.nextInt();
            db1.insertF(b);
        }
        else if(c==2){
            System.out.println("Enter a number:");
            int b=sc.nextInt();
            db1.insertE(b);
        }
        else if(c==3){
            System.out.println("Enter a position");
            int a=sc.nextInt();
            Node b=db1.deletesp(a);
            if(b==null){
                System.out.println("");
            }
            else{
                System.out.println(b.info);
            }
        }
        else if(c==4){
            db1.Display();
        }
        else if(c==-1){
            break;
        }
        else{
            System.out.println("Enter valid input");
        }

    }



  }
}

class Node {

  int info;
  Node Llink;
  Node Rlink;

  Node(int info) {
    this.info = info;
  }
}

class dbList {

  Node first = null, last = null;

  void insertF(int value) {
    if (first == null) {
      first = new Node(value);
      last = first;
      first.Llink = null;
      last.Llink = null;
      first.Rlink = null;
      last.Rlink = null;
    //   System.out.println(first.Llink+" "+first.info+" "+first.Rlink);
    } else {
      Node temp = new Node(value);
      temp.Llink = null;
      temp.Rlink = first;
      first.Llink = temp;
      first = temp;
    //   System.out.println(first.Llink+" "+first.info+" "+first.Rlink);
    }
  }

  void insertE(int value) {
    if (first == null) {
      first = new Node(value);
      last = first;
      first.Llink = null;
      last.Llink = null;
      first.Rlink = null;
      last.Rlink = null;
    //   System.out.println(last.Llink+" "+last.info+" "+last.Rlink);
    } else {
      Node temp = new Node(value);
      temp.Rlink = null;
      last.Rlink = temp;
      temp.Llink = last;
      last = temp;
    //   System.out.println(last.Llink+" "+last.info+" "+last.Rlink);
    // }
  }

  Node deletesp(int i) {
    if (first == null) {
      System.out.println("Linklist is null:)");
      return null;
    } else if (first == last && i == 1) {
      Node x = first;
      first = null;
      last = null;
      return x;
    } else {
      Node e = first;
      int y = 1;
      while (e != last) {
        y++;
        e = e.Rlink;
      }
      if (y >= i) {
        Node temp = first;

        for (int j = 1; j < i; j++) {
          temp = temp.Rlink;
        }
        if (i == 1) {
          first = first.Rlink;
          first.Llink = null;
        } else if (temp == last) {
          last = last.Llink;
          last.Rlink = null;
        } else {
        // System.out.println("Pred inde vado Data "+temp.info);
          temp.Llink.Rlink = temp.Rlink;
          temp.Rlink.Llink = temp.Llink;
        }
        return temp;
      } else {
        System.out.println("Invalid input:)");
        return null;
      }
    }
  }

  void Display() {
    if (first == null) {
      System.out.println("EMPTY:)");
      return;
    }
    Node temp = first;
    while (temp != last) {
        System.out.println(temp.info);
      temp = temp.Rlink;
    }
    System.out.println(last.info);
  }
}
}
