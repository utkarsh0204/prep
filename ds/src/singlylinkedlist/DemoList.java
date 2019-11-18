package singlylinkedlist;

public class DemoList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("length= " + list.length());
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.print();
		System.out.println("Value At 5= "+list.getValueAt(5));
		System.out.println("Value At 0= "+list.getValueAt(0));
		System.out.println("Value At 1= "+list.getValueAt(1));
		System.out.println("Value At 3= "+list.getValueAt(3));
		System.out.println("Value At -1= "+list.getValueAt(-1));
//		System.out.println("length= " + list.length());
//		list.deleteAtPos(0);
//		list.print();
//		System.out.println("length= " + list.length());
	}
}
