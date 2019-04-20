package eg.edu.alexu.csd.datastructure.linkedList.cs72_cs77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Singletesting {

	@Test
	void test() {
		SLinkedList Slist = new SLinkedList();
		Slist.add(2);
		Slist.add(3);
		Slist.add(4);
		Slist.add(3, 5);
		Object n1 = Slist.get(0);
		Object n2 = Slist.get(1);
		Object n3 = Slist.get(2);
		Object n4 = Slist.get(3);
		Object n5 = Slist.get(-1);
		assertEquals(2, n1);
		assertEquals(3, n2);
		assertEquals(4, n3);
		assertEquals(5, n4);
		assertEquals(null, n5);

		Slist.add(1, 9);
		Object n6 = Slist.get(1);
		assertEquals(9, n6);

		Slist.set(2, 10);
		Object n7 = Slist.get(2);
		assertEquals(10, n7);

		SLinkedList y = Slist.sublist(1, 3);
		Object n8 = y.get(0);
		Object n9 = y.get(4);
		assertEquals(9, n8);
		assertEquals(null, n9);

		int SizeBefore = Slist.size();
		Object NumBefore = Slist.get(2);
		Slist.remove(2);
		Object NumAfter = Slist.get(2);
		int SizeAfter = Slist.size();
		assertEquals(5, SizeBefore);
		assertEquals(4, SizeAfter);
		assertEquals(10, NumBefore);
		assertEquals(4, NumAfter);

		boolean Ishere = Slist.contains(9);
		boolean Ishere2 = Slist.contains(101);
		assertEquals(true, Ishere);
		assertEquals(false, Ishere2);

		Slist.clear();
		boolean isEmpty = Slist.isEmpty();
		assertEquals(true, isEmpty);

	}

}
