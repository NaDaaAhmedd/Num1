package eg.edu.alexu.csd.datastructure.linkedList.cs72_cs77;

public class DLinkedList {
	Dnode head;
	Dnode tail;

	public int size() {
		Dnode i = head;
		int size = 0;
		while (i != null) {
			size++;
			i = i.next;
		}
		return size;
	}

	public void add(int index, Object element) {
		int size = size();
		Dnode n = new Dnode();
		Dnode x = new Dnode();
		x = head;
		n.data = element;
		if (index == 0) {
			if (head == null) {
				head = n;
				tail = n;
			} else {
				n.next = x;
				x.prev = n;
			}
		} else if (index < 0 || index > size) {
			return;
		} else {
			for (int i = 0; i < index - 1; i++) {
				x = x.next;
			}
			if (x.next != null) {
				n.next = x.next;
				n.prev = x;
				x.next.prev = n;
				x.next = n;
			} else {
				n.next = x.next;
				n.prev = x;
				x.next = n;
			}
		}
		Dnode m = head;
		while (m.next != null) {
			m = m.next;
		}
		tail = m;
	}

	public void add(Object element) {
		Dnode n = new Dnode();
		n.data = element;
		Dnode x = head;
		if (head == null) {
			head = n;
			tail = n;
		} else {
			while (x.next != null) {
				x = x.next;
			}
			x.next = n;
			n.prev = x;
			tail = n;
		}
	}

	public Object get(int index) {
		int size = size();
		if (index < 0 || index > size)
			return null;
		else {
			Dnode n = head;
			int c = 0;
			while (c < index) {
				n = n.next;
				c++;
			}
			return n.data;
		}
	}

	public void set(int index, Object element) {

		Dnode n = head;
		int c = 0;
		while (c < index) {
			n = n.next;
			c++;
		}
		n.data = element;
	}

	public void clear() {

		head.data = null;
		tail.data = null;
		head.next = null;
		tail.prev = null;

	}

	public boolean isEmpty() {
		if (head.data == null)
			return true;
		else
			return false;
	}

	public void remove(int index) {
		Dnode n = head;
		int c = 0;
		Dnode y = tail;
		if (head.data == null)
			return;
		else {
			if (index == 0) {
				head = n.next;
			} else if (index == size() - 1) {
				tail = y.prev;
			} else {
				while (c < index - 1) {
					n = n.next;
					c++;
				}
				Dnode x = n.next;
				n.next = x.next;
				int m = size();
				while (m > index + 1) {
					y = y.prev;
					m--;
				}
				Dnode h = y.prev;
				y.prev = h.prev;
			}
		}
	}

	public boolean contains(Object o) {
		int size = size();
		Dnode n = head;
		for (int i = 0; i < size; i++) {
			if (n.data == o)
				return true;
			n = n.next;
		}
		return false;
	}

	public DLinkedList sublist(int fromIndex, int toIndex) {
		int size = size();
		if (fromIndex < 0)
			fromIndex = 0;
		if (toIndex > size - 1)
			toIndex = size - 1;
		DLinkedList y = new DLinkedList();
		Dnode n = head;
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

	public void show() {
		Dnode n = head;
		while (n.next != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print(n.data);

	}

	public void showp() {
		Dnode n = tail;

		while (n.prev != null) {
			System.out.print(n.data + " ");
			n = n.prev;
		}
		System.out.print(n.data);
	}
}