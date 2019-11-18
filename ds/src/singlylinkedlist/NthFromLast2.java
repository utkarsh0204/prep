package singlylinkedlist;

import singlylinkedlist.LinkedList.Node;

public class NthFromLast2 {
	public static void main(String[] args) {
		NthFromLast2 obj = new NthFromLast2();
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		obj.findNth(list.head, 1);
	}

	private void findNth(Node head, int n) {
		// TODO Auto-generated method stub
		if (n <= 0) {
			System.out.println("No Element Exists");
			return;
		}
		int i = 0;
		Node p1 = head;
		Node p2 = head;
		while (i < n) {
			if (p1 == null) {
				System.out.println("No Element Exists");
				return;
			}
			p1 = p1.next;
			i++;
		}
		while (p1 != null) {
			p2 = p2.next;
			p1 = p1.next;
		}
		System.out.println(p2.data);
	}
}
