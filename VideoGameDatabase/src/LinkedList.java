// Written by Joe Comiskey

public class LinkedList <T>
{
	private class ListNode
	{
	T data;
	ListNode link;
	public ListNode(T aData, ListNode aLink)
	{
		data = aData;
		link = aLink;
	}
}
	//instance variables
	private ListNode head;
	private ListNode current;
	private ListNode previous;
	private int size;
	//constructor
	public LinkedList()
	{
		head = current = previous = null;
		this.size = 0;
	}
	//adds new node
	public void add(T aData)
	{
		ListNode newNode = new ListNode(aData, null);
		if(head == null)
		{
			head = current = newNode;
			this.size = 1;
			return;
		}
		ListNode temp = head;
		while(temp.link != null)
			temp = temp.link;
		temp.link = newNode;
		this.size++;
	}
	//prints nodes
	public void print()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	//adds new node after current node
	public void addAfterCurrent(T aData) {
		if(current == null)
			return;
		ListNode newNode = new ListNode(aData,current.link);
		current.link = newNode;
		this.size++;
	}
	//gets data in current node
	public T getCurrent()
	{
		if(current == null)
			return null;
		return current.data;
	}
	//sets current node to aData
	public void setCurrent(T aData)
	{
		if(aData == null || current == null)
			return;
		current.data = aData;
	}
	//goes to the next node
	public void goToNext()
	{
		if(current == null)
			return;
		previous = current;
		current = current.link;
	}
	//sets current node equal to the head
	public void reset()
	{
		current = head;
		previous = null;
	}
	//checks to see if end of list
	public boolean hasMore()
	{
		return current != null;
	}
	//removes current node
	public void removeCurrent()
	{
		if(current == head)
		{
			head = head.link;
			current = head;
		}
		else
		{
			previous.link = current.link;
			current = current.link;
		}
		if(this.size > 0)
			size--;
	}
	//gets size of list
	public int getSize()
	{
		return this.size;
	}
	public T getAt(int index)
	{
		if(index < 0 || index >= size)
			return null;
		ListNode temp = head;
		for(int i = 0; i<index; i++)
			temp = temp.link;
		return temp.data;
	}
	public void setAt(int index, T aData)
	{
		if(index < 0 || index >= size || aData == null)
			return;
		ListNode temp = head;
		for(int i = 0; i<index; i++)
			temp = temp.link;
		temp.data = aData;
	}
	
}
