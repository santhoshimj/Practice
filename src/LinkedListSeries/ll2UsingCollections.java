package LinkedListSeries;
import java.util.*;
public class ll2UsingCollections {

	public static void main(String[] args) {
		
		LinkedList<String> list =new LinkedList<String>();
		System.out.println("the size of the linked list is : " + list.size());
		
		list.add("is");
		list.addFirst("this");
		
		System.out.println("the elements in the list are : ");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i) + " --> ");
		}
		System.out.println("null");
		System.out.println(list.poll());
		System.out.println("the array form of the ll");
		//System.out.println(list.toArray());
		
	}

}
