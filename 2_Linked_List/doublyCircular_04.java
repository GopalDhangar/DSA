class Node{                                 // Node Class
   int data;
   Node next;
    Node prev;

    Node(int x){                        // Node Constructor
      data=x;
      next=null;
      prev=null;
      }
   }

  class headLink{                     // Head Class 
   Node start, last;

   void addNode(int x){         // Node Linking
    Node ptr=new Node(x);
     if(start==null){
      start=ptr;
      last=ptr;
      last.next=start;
      start.prev=last;
     }
     else{
      last.next=ptr;
      ptr.prev=last;
      last=ptr;
      last.next=start;
      start.prev=last;
       }
     }

     void forwardDisplay() {             // Forward Display
     if(start==null){
     System.out.println("Linked list is   empty: ");
      }else{
           Node temp=start;
           do{
                System.out.print(temp.data+" ");
                 temp=temp.next;
                }
                while(temp!=start);
              }
            System.out.println(": Forward display");
      }

       void backwardDisplay() {                        //Backward Display
           if(start==null){
           System.out.println("Linked list is empty: ");
           }else{
               Node temp=last;
                do{
                System.out.print(temp.data+" ");
                 temp=temp.prev;
                 }
                  while(temp!=last);
                 }
              System.out.println(": Backward Display");
      }
    
      void addFirst(int x){                                     // Add At first
         Node ptr=new Node(x);
         if(start==null){
         start=ptr;
         last=ptr;
         last.next=start;
          start.prev=last;
          }else
        {
          ptr.next=start;
          start.prev=ptr;
           start=ptr;
           last.next=start;
          start.prev=last;
        }
      System.out.println("Add At first: ");

    }
   
      void removeFirst(){                                  // Remove At First
       if(start==null ){
       System.out.println("Linked list is already empty: ");
      }
      else if(start.next==null){
       start=null;
       }else{
         Node temp=start;
         start=start.next;
        last.next=start;
        start.prev=last;
       temp=null;
      }
    System.out.println("Remove first: ");

}

     void addLast(int x){                                       // Add At Last
         Node ptr=new Node(x);
         if(start==null){
         start=ptr;
         last=ptr;
         last.next=start;
          start.prev=last;
          }else
        {
            last.next=ptr;
            ptr.prev=last;
            last=ptr; 
            last.next=start;
            start.prev=last;
        }
     System.out.println("Add At Last: ");
    }

       void removeLast(){                                         //Remove at Last
       if(start==null ){
       System.out.println("Linked list is already empty: ");
      }
      else if(start.next==null){
       start=null;
       }else{
         Node temp=last;
         last=last.prev;
        last.next=start;
        start.prev=last;
       temp=null;
      }
     System.out.println("Remove At Last: ");
}

      int count()                                                  // Count the Nodes
     {
       int c=0;
       Node temp=start;
      do{
            c++;
            temp=temp.next;
            }
          while(temp!=start);
           return c;
        }
    
    void addAtIndex(int position,int value){           //Add At index
   if(position<0 && position>count()){
   System.out.println("can not possible : ");
  }else if(position==0){
      addFirst(value);
    }else if(position==count()){
       addLast(value);
     }else{
           Node ptr=new Node(value);
           Node temp=start;
          for(int i=1;i<position;i++){
           temp=temp.next;
         }
            ptr.next=temp.next;
             temp.next.prev=ptr;
             temp.next=ptr;
             ptr.prev=temp;
           }
       System.out.println("Add At Index: "+position+","+value);
       }
   
       void removeAtIndex(int position){                                                //remove At index
   if(position<0 && position>count()){
   System.out.println("can not possible : ");
  }else if(position==0){
      removeFirst();
    }else if(position==count()){
       removeLast();
     }else{
           Node temp=start;
          for(int i=1;i<=position;i++){
           temp=temp.next;
         }
            Node r=temp;
           temp.prev.next=temp.next;
          temp.next.prev=temp.prev;
           r=null;
           }
       System.out.println("Remove At Index: "+position);
       }
}

     class doublyCircular_04{
      public static void main(String ...k){
      headLink obj=new headLink();
      obj.addNode(45);
       obj.addNode(50);
       obj.addNode(55);
        obj.addNode(65);
         obj.forwardDisplay();
         obj.backwardDisplay();
         obj.addFirst(12);
          obj.forwardDisplay();
         obj.removeFirst();
          obj.forwardDisplay();
           obj.addLast(90);
          obj.forwardDisplay();
           obj.removeLast();
          obj.forwardDisplay();
          System.out.println("no of node: "+obj.count());
         obj.addAtIndex(0,44);
          obj.forwardDisplay();
          obj.removeAtIndex(3);
          obj.forwardDisplay();
        }
   }
   

   