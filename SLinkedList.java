package eg.edu.alexu.csd.datastructure.linkedList.cs72_cs77;

public class SLinkedList {
	Node head;

	public int size() {
		Node i = head;
		int size = 0;
		while (i != null) {
			size++;
			i = i.next;
		}
		return size;
	}

	public void add(int index, Object element) {
		int size = size();
		Node n = new Node();
		n.data = element;

		if (index == 0) {
			n.next = head;
			head = n;
		} else if (index > size || index < 0) {
			return;
		} else {
			Node node = head;
			for (int c = 0; c < index - 1; c++) {
				node = node.next;
			}
			n.next = node.next;
			node.next = n;
		}

	}

	public void add(Object element) {
		int size = size();
		add(size, element);

	}

	public Object get(int index) {
		int size = size();

		if (index == 0) {
			return head.data;
		} else if (index > size || index < 0) {
			return null;
		} else {
			Node n = head;
			for (int i = 0; i < index; i++) {
				n = n.next;
			}
			return n.data;
		}
	}

	public void set(int index, Object element) {
		int size = size();
		if (index == 0) {
			head.data = element;
		} else if (index > size || index < 0) {
			return;
		} else {
			Node n = head;
			for (int i = 0; i < index; i++) {
				n = n.next;
			}
			n.data = element;
		}

	}

	public void clear() {
		head.data = null;
		head.next = null;
	}

	public void remove(int index) {
		int size = size();
		boolean isEmpty = isEmpty();
		if (isEmpty == true)
			return;
		else {
			if (index == 0) {
				if (head.next == null)
					return;
				head = head.next;
			} else if (index > size || index < 0)
				return;
			else {
				Node n = head;
				for (int i = 0; i < index - 1; i++) {
					n = n.next;
				}
				n.next = n.next.next;
			}
		}
	}

	public boolean contains(Object o) {
		int size = size();
		Node n = head;
		for (int i = 0; i < size; i++) {
			if (n.data == o)
				return true;
			n = n.next;
		}
		return false;
	}

	public boolean isEmpty() {
		if (head.data == null)
			return true;
		else
			return false;
	}

	public SLinkedList sublist(int fromIndex, int toIndex) {
		int size = size();
		if (fromIndex < 0)
			fromIndex = 0;
		if (toIndex > size - 1)
			toIndex = size - 1;
		SLinkedList y = new SLinkedList();
		Node n = head;
		int c = toIndex - fromIndex + 1;
		while (fromIndex != 0) {
			n = n.next;
			fromIndex--;
		}
		while (c != 0) {
			y.add(n.data);
			n = n.next;
			c--;
		}
		return y;
	}

	public void show(Node head) {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

}
