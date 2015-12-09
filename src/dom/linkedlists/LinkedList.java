/**
 * 
 */
package dom.linkedlists;

/**
 * @author AmitGupta
 *
 */
class LinkedList 
{
	Node head; //head of linkedList
	
	//linked list node
	static class Node
	{
		int data;
		Node next;
		
		//constructor to create a new node
		Node(int d) {data =d; next = null;}
	}
	
	public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
 
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList llist = new LinkedList();
 
        llist.head       = new Node(1);
        Node second      = new Node(2);
        Node third       = new Node(3);
 
        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node
 
        llist.printList();
    }
}
