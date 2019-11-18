package singlylinkedlist;

import singlylinkedlist.LinkedList.Node;

public class Frequency {
	public static void main(String[] args) {
		Frequency obj=new Frequency();
		LinkedList list =new LinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(2);
		list.append(2);
		list.append(4);
		list.append(1);
		list.append(5);
		list.append(6);
		obj.find(list.head);
	}

	private void find(Node head) {
		// TODO Auto-generated method stub
		Node node=head;
		while(node!=null) {
			System.out.println("Freq Of "+node.data+"= "+findFreq(head,node.data));
			node=node.next;
		}
	}

	private int findFreq(Node head, int x) {
		// TODO Auto-generated method stub
		if(head==null)
			return 0;
		int freq=findFreq(head.next,x);
		if(head.data==x)
			return ++freq;
		return freq;
	}
}
