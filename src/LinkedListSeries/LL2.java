package LinkedListSeries;

public class LL2 {

	    static class Node{
	        String data;
	        Node next;
	        
	        Node(String data){
	            this.data=data;
	            this.next=null;
	        }
	    }
	    //add the node to the ll in the first, late
	    
	    //add-first
	    static Node head;
	    public static void addFirst(String data)
	    {
	        Node newNode=new Node(data);
	        
	        if(head==null)
	        {
	            head=newNode;
	            System.out.println("new node created");
	            return;
	        }
	        
	        //else
	        newNode.next=head;
	        head=newNode;
	        System.out.println("new node added to the LL");
	    }
	    
	    //adding the element in the last of the LL
	    public static void addLast(String data){
	        Node newNode=new Node(data);
	        
	        if(head==null)
	        {
	            head=newNode;
	            System.out.println("new node created");
	            return;
	        }
	        
	        Node temp=head;
	        while(temp.next!=null){
	            temp=temp.next;
	        }
	        temp.next=newNode;
	    }
	    
	    //printing the data present in the LL
	   public static void print()
	   {
	       if(head==null)
	       {
	           System.out.println("the list is empty");
	           return;
	       }
	        Node temp = head;
	        System.out.print("Linked List: ");
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null"); 
	   }

	    
	    public static void main(String args[])
	    {
	        LL2 mm=new LL2();
	        LL2.addFirst("a");
	        LL2.addFirst("b");
	        LL2.addLast("is");
	        System.out.println("data added successfully!!");
	        LL2.print();
	    }
	}
	

