//Written by Joe Comiskey
public class CommandQueue <T> {
	//creates ListNode object 
	public class ListNode{
		T data;
		ListNode link;
		public ListNode(T aData, ListNode aLink)
		{
			this.data = aData;
			this.link = aLink;
		}
	}
	//instance variables
	private ListNode head;
	private ListNode tail;
	private int size;
	//constructor
	public CommandQueue()
	{
		head = tail = null;
	}
	//creates new object and adds new object to the queue. Increases size by 1.
	public void enqueue(T aData)
	{
		ListNode newNode = new ListNode(aData, null);
		if(head == null)
		{
			head = newNode;
			tail = head;
			size=1;
			return;
		}
		this.tail.link = newNode;
		this.tail = newNode;
		size++;
	}
	//removes an item from the queue and decreases size by 1
	public T dequeue() {
		if(head == null)
			return null;
		ListNode temp = head;
		head = head.link;
		size--;
		return temp.data;
	}
	//checks the value at head node and returns it as string
	public String peek() {
		if(head == null)
			return null;
		return head.data.toString();
	}
	
	
}
