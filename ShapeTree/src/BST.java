/*
 * By Joe Comiskey
 */
public class BST  
{
	private class Node
	{
		//properties of node of type Shape
		public Shape data;
		public Node leftChild;
		public Node rightChild;
		public Node(Shape aData)
		{
			data = aData;
			leftChild = rightChild = null;
		}
	}
	private Node root;
	//constructor
	public BST()
	{
		root = null;
	}
	//adds shape with root and data associated with that shape
	public void add(Shape aData)
	{
		if(root == null)
			root = new Node(aData);
		else
			add(root,aData);
	}
	private Node add(Node aNode, Shape aData)
	{
		if(aNode == null)
			aNode = new Node(aData);
		else if(aData.compareTo(aNode.data)<0)
			aNode.leftChild = add(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data)>0)
			aNode.rightChild = add(aNode.rightChild,aData);
		return aNode;
	}
	//search method that takes in the type and area
	//Uses accessors to check if the type and area match what you are searching for
	public void search(String type, double area)
	{
		Node temp = root;
		while(temp != null)
		{
			if(area == temp.data.getArea() && type.equals(temp.data.getType()))
			{
				temp.data.print();
				break;
			}
			else if(area < temp.data.getArea())
			{
				temp = temp.leftChild;
			}
			else
			{
				temp = temp.rightChild;
			}
		}
	}
	//deletes certain Shape
	//takes in the type and area
	public void delete(String type, double area)
	{
		System.out.println("Deleting...");
		search(type,area);
		nodeDelete(type,area);
	}
	public void nodeDelete(String type, double area)
	{
		//creates 2 new nodes
		Node temp = root;
		Node parent = null;
		while(temp!= null)
		{
			if(area == temp.data.getArea() && type.equals(temp.data.getType()))
			{
				//if both children are null, the parents of both children are set to null
				if(temp.leftChild == null && temp.rightChild == null)
				{
					if(temp == root)
					{
						root = null;
						break;
					}
					if(temp == parent.leftChild)
					{
						parent.leftChild = null;
					}
					else
					{
						parent.rightChild = null;
					}
				}
				//if the right child and parent are null the root is set to the left child
				else if(temp.rightChild == null)
				{
					if(parent == null)
					{
						root = root.leftChild;
						break;
					}
					if(temp == parent.leftChild)
					{
						parent.leftChild = temp.leftChild;
					}
					else
					{
						parent.rightChild = temp.leftChild;
					}
				}
				else
				{
					//2 new temp nodes are created
					Node temp2 = temp.rightChild;
					Node parent_temp2 = temp;
					//while the new temp left child isn't null, the parent is set to the new temp and temp is reassigned to the left child
					while(temp2.leftChild != null)
					{
						parent_temp2 = temp2;
						temp2 = temp2.leftChild;
					}
					temp.data = temp2.data;
					if(temp2 == parent_temp2.leftChild)
					{
						parent_temp2.leftChild = temp2.rightChild;
					}
					else
					{
						parent_temp2.rightChild = temp2.rightChild;
					}
				}
				break;
			}
			//if the area is less than the accessed area, temp is set to the left child otherwise it is set to the right child
			else if(area < temp.data.getArea())
			{
				parent = temp;
				temp = temp.leftChild;
			}
			else
			{
				parent = temp;
				temp = temp.rightChild;
			}
		}
	}
	//new temp node created. If the accessed area is greater than the parameter area value, the right child is set to null and the delete node method is called with the correct data values
	//temp is then set to the root
	//if that if statement is false then temp is set to the right child
	public void deleteGreaterThan(double area)
	{
		System.out.println("Deleting values greater than " + area);
		Node temp = root;
		while(temp != null)
		{
			if(temp.data.getArea() > area)
			{
				temp.rightChild = null;
				nodeDelete(temp.data.getType(), temp.data.getArea());
				temp = root;
			}
			else
			{
				temp = temp.rightChild;
			}
		}
	}
	//all print methods
	public void printPreorder()
	{
		printPreorder(root);
	}
	public void printPreorder(Node aNode)
	{
		if(aNode == null)
			return;
		aNode.data.print();
		printPreorder(aNode.leftChild);
		printPreorder(aNode.rightChild);
	}
	public void printInorder()
	{
		printInorder(root);
	}
	public void printInorder(Node aNode)
	{
		if(aNode == null)
			return;
		printInorder(aNode.leftChild);
		aNode.data.print();
		printInorder(aNode.rightChild);
	}
	public void printPostorder()
	{
		printPostorder(root);
	}
	public void printPostorder(Node aNode)
	{
		if(aNode == null)
			return;
		printPostorder(aNode.leftChild);
		printPostorder(aNode.rightChild);
		aNode.data.print();
	}
	//creates new temp node and sets it to the root
	//while the right child is not null, temp is set to the right child and the area of temp is returned
	public double maxArea()
	{
		Node temp = root;
		while(temp.rightChild != null)
		{
			temp = temp.rightChild;
		}
		return temp.data.getArea();
	}
	
	
}



