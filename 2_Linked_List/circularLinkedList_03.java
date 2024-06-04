class Node {                                      // NODE CLASS
    int data;
    Node next;

    Node(int x)                                    //Constructor
       {
        data = x;
        next = null;
       }
}

    class headLink{                             // HEAD CLASS
        Node start,last;

        headLink()                                 //Constructor
           {
            start=null;
            last=null;
          }

        void addNode(int x){                    // JOINING THE NODE
            Node ptr=new Node(x);
            if(start==null){
                start=ptr;
                last=ptr;
                last.next=start;
            }
            else{
                last.next=ptr;
                last=ptr;
                last.next=start;
            }
        }
       
         int count()                                       //COUNT THE NODE LIST
        {
          int c=0;
        if(start==null)
         return c;
        else{
          Node t=start;
         do{
           c++;
          t=t.next;
         }
       while(t!=start);
        return c;  
        }
      }

        void getFirst()                               // GET FIRST NODE
        {
         if(start==null){
         System.out.println("List is Empty: ");
         }else{
         System.out.println("First node : "+start.data);
       }
     }

        void getLast()                                      // GET LAST NODE
        {
         if(start==null){
         System.out.println("List is Empty: ");
         }else{
         System.out.println("Last Node : "+last.data);
       }
     }

       void removeFirst(){                        // REMOVE First
       if(start==null){
       System.out.println("Linked List is Already empty: ");
       }else{
           Node t=start;
            start=start.next;
           last.next=start;
          t=null;
             }
           }
       
         void removeLast(){                        // REMOVE LAST
       if(start==null){
       System.out.println("Linked List is Already empty: ");
       }
       else if(start==last){
           start=null;
          last.next=null;
          last=null;
       }
       else{
             Node t=start;
             while(t.next!=last){
             t=t.next;
            }
         Node r=last;
          last=t;
         last.next=start;
         r=null;
          }
     }

       int sum(){                            // SUM
         int s=0;
         Node t=start;
          do{
        s=s+t.data;
       t=t.next;
        }
      while(t!=start);
       return s;
      }
          
        void display()                                  // DISPLAY FUNCTION
        {
            if(start==null)
                System. out.println("Linked list is empty");
            else{
                Node t=start;
                do{
                    System.out.print(t.data+" ");
                    t=t.next;
                }
                while(t!=start);
            }
        }
    }

class circularLinkedList_03{                                   // MAIN CLASS
    public static void main(String[] args) {
        headLink obj=new headLink();
        System. out.print("The Original Node List : ");
        obj.addNode(45);
        obj.addNode(67);
        obj.addNode(48);
        obj.addNode(69);
        obj.addNode(19);
        obj.display();
        System.out.println();
       System.out.println("Count : "+obj.count());
        obj.getFirst();
        obj.getLast();
       obj.removeFirst();
       System. out.print("After remove first node  : ");
        obj.display();
        System.out.println();
       obj.removeLast();
       System. out.print("After remove last node  : ");
        obj.display();
        System.out.println();
       System.out.println("sum : "+obj.sum());
    }
}
