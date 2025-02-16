package LinkedListSeries;

public class LL1 {
	
	class Node{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data= data;
			this.next=null;
		}
	}
	
	private Node head;
	
	//add first element and last element
	public void addFirst(String data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
	}
	
	public void printList()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		LL1 list = new LL1();
		list.addFirst("a");
		list.addFirst("strong");
		list.addFirst("women");
		list.addFirst("rises");
		list.addFirst("like");
		list.addFirst("a");
		list.addFirst("Phoneix");
		
		System.out.print("The elements in the list are: ");
		list.printList();
	}

}
