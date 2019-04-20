package eg.edu.alexu.csd.datastructure.linkedList.cs72_cs77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Doubletesting {

	@Test
	void test() {
		DLinkedList Dlist = new DLinkedList();
		Dlist.add(10);
		Dlist.add(20);
		Dlist.add(30);
		Dlist.add(40);
		Dlist.add(4, 50);
		Object m1 = Dlist.get(0);
		Object m2 = Dlist.get(1);
		Object m3 = Dlist.get(2);
		Object m4 = Dlist.get(3);
		Object m5 = Dlist.get(4);
		Object m6 = Dlist.get(-1);
		assertEquals(10, m1);
		assertEquals(20, m2);
		assertEquals(30, m3);
		assertEquals(40, m4);
		assertEquals(50, m5);
		assertEquals(null, m6);

		Dlist.add(1, 100);
		Object m7 = Dlist.get(1);
		assertEquals(100, m7);

		Dlist.set(2, 200);
		Object m8 = Dlist.get(2);
		assertEquals(200, m8);

		DLinkedList z = Dlist.sublist(1, 3);
		Object m9 = z.get(0);
		Object m10 = z.get(4);
		assertEquals(100, m9);
		assertEquals(null, m10);

		int SizeBeforeInDouble = Dlist.size();
		Object NumBeforeInDouble = Dlist.get(2);
		Dlist.remove(2);
		Object NumAfterInDouble = Dlist.get(2);
		int SizeAfterInDouble = Dlist.size();
		assertEquals(6, SizeBeforeInDouble);
		assertEquals(200, NumBeforeInDouble);
		assertEquals(5, SizeAfterInDouble);
		assertEquals(30, NumAfterInDouble);

		boolean d = Dlist.contains(50);
		boolean d1 = Dlist.contains(105);
		assertEquals(true, d);
		assertEquals(false, d1);

		Dlist.clear();
		boolean isEmptyInDouble = Dlist.isEmpty();
		assertEquals(true, isEmptyInDouble);
	}

}
