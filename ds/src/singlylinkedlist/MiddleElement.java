package singlylinkedlist;

import singlylinkedlist.LinkedList.Node;

public class MiddleElement {
	public static void main(String[] args) {
		MiddleElement obj = new MiddleElement();
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		obj.findMiddle(list.head);
	}

	private void findMiddle(Node head) {
		// TODO Auto-generated method stub
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle Element= " + slow.data);
	}
}
