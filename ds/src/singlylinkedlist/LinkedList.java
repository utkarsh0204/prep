package singlylinkedlist;

public class LinkedList {
	private Node head;

	private class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void push(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}

	void addAfter(int key, int data) {
		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		Node current = head;
		while (current != null) {
			if (current.data == key) {
				Node node = new Node(data);
				node.next = current.next;
				current.next = node;
				break;
			}
			current = current.next;
		}
		if (current == null)
			System.out.println("Element Not found");
	}

	void delete(int key) {
		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		Node current = head;
		if (current.data == key) {
			head = head.next;
			return;
		}
		current = current.next;
		Node prev = head;
		while (current != null) {
			if (current.data == key) {
				prev.next = current.next;
				break;
			}
			prev = current;
			current = current.next;
		}
		if (current == null) {
			System.out.println("Element Not Found");
		}
	}

	void deleteAtPos(int index) {
		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		if (index == 0) {
			head = head.next;
			return;
		}
		Node current = head.next;
		Node prev = head;
		int i = 1;
		while (current != null) {
			if (i == index) {
				prev.next = current.next;
				break;
			}
			i++;
			prev = current;
			current = current.next;
		}
		if (current == null) {
			System.out.println("Index Not found");
		}
	}

	void print() {
		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		Node current = head;
		while (current.next != null) {
			System.out.print(current.data + "=>");
			current = current.next;
		}
		System.out.print(current.data);
		System.out.println();
	}

	int peek() {
		if (head == null) {
			System.out.println("List Empty");
			return -1;
		}
		return this.head.data;
	}

	int length() {
		return getLength(this.head);
	}

	private int getLength(Node node) {
		if (node == null)
			return 0;
		return 1 + getLength(node.next);
	}

	int getValueAt(int index) {
		return getValue(head, index, 0);
	}

	private int getValue(Node node, int index, int i) {
		// TODO Auto-generated method stub
		if (node == null || index < 0) {
			System.out.println("No Element Exist");
			return -1;
		}
		if (i == index) {
			return node.data;
		}
		return getValue(node.next, index, ++i);
	}
}
