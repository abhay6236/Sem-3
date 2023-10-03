import java.util.Scanner;
public class BinarySerchTree{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   
        binaryTree b1=new binaryTree();

        
        while(true){
            System.out.println("Enter 1 for Insert,\nEnter 2 for preorder,\nEnter 3 for inorder,\nEnter 4 for postoreder,\nEnter 5 for delete,\nEnter -1 to End");
        int c=sc.nextInt();
            if(c==1){
                System.out.println("Enter a number:");
                int b=sc.nextInt();
                b1.insert(b);
            }
            else if(c==2){
                b1.preorder(b1.root);    
            }
            else if(c==3){
                b1.inorder(b1.root);    
            }
            else if(c==4){
                b1.postorder(b1.root);    
            }
            else if(c==-1){
                break;
            }
            else if(c==5){
                System.out.println("Enter value");
                int b=sc.nextInt();
                Node e=b1.Delete(b);
                if(e!=null){
                    System.out.println(e.info);
                }
            }
            else{
                System.out.println("Enter a valid input");
            }
            
        }
    }
}

class Node{
    int info;
    Node Llink;
    Node Rlink;


    Node(int info){
        this.info=info;
    }
}

class binaryTree{
    Node root;
    
    void insert(int value){
        if(root==null){
            root=new Node(value);
            root.Llink=null;
            root.Rlink=null;
        }
        else{
            Node temp=new Node(value);
            Node c=root;
            if(temp.info>c.info){
                while(c.Rlink!=null){
                    if(temp.info>c.info){
                        c=c.Rlink;
                       
                    }
                    else if(temp.info<c.info){
                        c=c.Llink;
                    }
                    else{
                        break;
                    }
    
                }
            }
            else{
                while(c.Llink!=null){
                    if(temp.info>c.info){
                        c=c.Rlink;
                       
                    }
                    else if(temp.info<c.info){
                        c=c.Llink;
                    }
                    else{
                        break;
                    }
    
                }

            }
         
            if(temp.info!=c.info){
                if(temp.info>c.info){
                    c.Rlink=temp;
                }
                else{
                    c.Llink=temp;
                }
            }
        }
    }



 Node Delete(int value){
     if(root==null){
      System.out.println("Empty Tree!");
     }
    else {
    Node c=root;
    Node pre = root;
    try {
        while(c.info!=value){
            if(value>c.info){
                pre=c;
               c=c.Rlink;
            }
            else if(value<c.info){
                pre=c;
                c=c.Llink;
    
            }
        }
        if(c.Rlink==null && c.Llink==null){
            if(pre.info>c.info){
                pre.Llink=null;
            }
            else{
                pre.Rlink=null;
            }
            return c;
        }
        else{
            Node temp=c.Rlink;
            while(temp.Llink!=null){
                temp=temp.Llink;
            }
            if(c.Rlink!=null){
                pre.Rlink=c.Rlink;
            }
         if(c.Llink!=null)
         {
            pre.Llink=c.Llink;
         }
        }
    } catch (Exception e) {
        System.out.println("Invalid input");
        return null;
    }
        
}
return null;
 }



    void preorder(Node froot){
        if(froot==null){
            return;
        }
        System.out.println(froot.info);
        preorder(froot.Llink);
        preorder(froot.Rlink);
    }
  
        
    void inorder(Node froot){
        if(froot==null){
            return;
        }
  
        inorder(froot.Llink);
        System.out.println(froot.info);
        inorder(froot.Rlink);
    }

    void postorder(Node froot){
        if(froot==null){
            return;
        }
        
        postorder(froot.Llink);
        postorder(froot.Rlink);
        System.out.println(froot.info);
    }
}

    