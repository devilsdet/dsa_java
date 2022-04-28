package dsa_java.recursion;

public class DeleteMiddleEleemntInLinkedList_05 {
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String args[]) {
		Node link = new Node(21);
		link.next = new Node(22);
		link.next.next = new Node(23);
		link.next.next.next = new Node(24);
		link.next.next.next.next = new Node(25);
		traverseList(link);
		// deleteMiddleElemnt(link, 2);
		
	}
	
	public static void traverseList(Node head) {
		while(head != null) {
			System.out.print(head.data + " --> ");
			head = head.next;
		}
		
	}
	
//	public static Node deleteMiddleElemnt(Node link,int key) {
//		if(key == 1) {
//			
//		}
//		int data = fetchLastNodeData(link);
//		
//	}
	
	
	public static int fetchLastNodeData(Node link) {
		while(link.next != null) {
			link = link.next;
		}
		return link.data;
	}
	
//	public static Node deleteLastNode(Node link) {
//		while(head.next) {
//			
//		}
//	}

}
