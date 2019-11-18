package singlylinkedlist;

import singlylinkedlist.LinkedList.Node;

public class NthFromLast1 {
	static int count=0;
	public static void main(String[] args) {
		NthFromLast1 obj=new NthFromLast1();
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		obj.getNth(list.head,6);
	}
	private void getNth(Node head, int i) {
		// TODO Auto-generated method stub
		if(head==null)
			return;
		getNth(head.next,i);
		if(++count==i)
			System.out.println(head.data);
	}
}
