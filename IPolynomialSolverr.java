package eg.edu.alexu.csd.datastructure.linkedList.cs72_cs77;

import java.lang.Math;

public class IPolynomialSolverr {
	DLinkedList Ac = new DLinkedList();
	DLinkedList Ae = new DLinkedList();
	DLinkedList Bc = new DLinkedList();
	DLinkedList Be = new DLinkedList();
	DLinkedList Cc = new DLinkedList();
	DLinkedList Ce = new DLinkedList();
	DLinkedList Rc = new DLinkedList();
	DLinkedList Re = new DLinkedList();

	public void Sort(int terms[][]) {
		int n = terms.length;
		for (int i = n - 2; i >= 0; i--) {
			int C = terms[i][0];
			int E = terms[i][1];
			int j = i + 1;
			while (j < n && terms[j][1] > E) {
				terms[j - 1][0] = terms[j][0];
				terms[j - 1][1] = terms[j][1];
				j += 1;
			}
			terms[j - 1][0] = C;
			terms[j - 1][1] = E;
		}
	}

	public void setPolynomial(char poly, int[][] terms) {
		if (poly == 'A') {
			for (int i = 0; i < terms.length; i++) {
				Ac.add(terms[i][0]);
				Ae.add(terms[i][1]);
			}
		} else if (poly == 'B') {
			for (int i = 0; i < terms.length; i++) {
				Bc.add(terms[i][0]);
				Be.add(terms[i][1]);
			}
		} else if (poly == 'C') {
			for (int i = 0; i < terms.length; i++) {
				Cc.add(terms[i][0]);
				Ce.add(terms[i][1]);
			}
		}
	}

	int[][] add(char poly1, char poly2) {
		Rc.clear();
		Re.clear();
		if ((poly1 == 'A' || poly2 == 'A') && Ac.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}
		if ((poly1 == 'B' || poly2 == 'B') && Bc.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}
		if ((poly1 == 'C' || poly2 == 'C') && Cc.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}

		if (poly1 == 'A' && poly2 == 'B') {
			Dnode nc1 = Ac.head;
			Dnode ne1 = Ae.head;
			Dnode nc2 = Bc.head;
			Dnode ne2 = Be.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc2.data + (int) nc1.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				} else if ((int) ne1.data > (int) ne2.data) {
					Re.add(ne1.data);
					Rc.add(nc1.data);
					nc1 = nc1.next;
					ne1 = ne1.next;
				} else if ((int) ne2.data > (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add(nc2.data);
					nc2 = nc2.next;
					ne2 = ne2.next;
				}

			}
			if (nc1 == null && nc2 != null) {
				Re.add(ne2.data);
				Rc.add(nc2.data);
				nc2 = nc2.next;
				ne2 = ne2.next;
			}
			if (nc2 == null && nc1 != null) {
				Re.add(ne1.data);
				Rc.add(nc1.data);
				nc1 = nc1.next;
				ne1 = ne1.next;
			}

		}
		if (poly1 == 'A' && poly2 == 'C') {
			Dnode nc1 = Ac.head;
			Dnode ne1 = Ae.head;
			Dnode nc2 = Cc.head;
			Dnode ne2 = Ce.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc2.data + (int) nc1.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				} else if ((int) ne1.data > (int) ne2.data) {
					Re.add(ne1.data);
					Rc.add(nc1.data);
					nc1 = nc1.next;
					ne1 = ne1.next;
				} else if ((int) ne2.data > (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add(nc2.data);
					nc2 = nc2.next;
					ne2 = ne2.next;
				}

			}
			if (nc1 == null && nc2 != null) {
				Re.add(ne2.data);
				Rc.add(nc2.data);
				nc2 = nc2.next;
				ne2 = nc2.next;
			}
			if (nc2 == null && nc1 != null) {
				Re.add(ne1.data);
				Rc.add(nc1.data);
				nc1 = nc1.next;
				ne1 = ne1.next;
			}

		}
		if (poly1 == 'B' && poly2 == 'C') {
			Dnode nc1 = Bc.head;
			Dnode ne1 = Be.head;
			Dnode nc2 = Cc.head;
			Dnode ne2 = Ce.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc2.data + (int) nc1.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				} else if ((int) ne1.data > (int) ne2.data) {
					Re.add(ne1.data);
					Rc.add(nc1.data);
					nc1 = nc1.next;
					ne1 = ne1.next;
				} else if ((int) ne2.data > (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add(nc2.data);
					nc2 = nc2.next;
					ne2 = ne2.next;
				}

			}
			if (nc1 == null && nc2 != null) {
				Re.add(ne2.data);
				Rc.add(nc2.data);
				nc2 = nc2.next;
				ne2 = ne2.next;
			}
			if (nc2 == null && nc1 != null) {
				Re.add(ne1.data);
				Rc.add(nc1.data);
				nc1 = nc1.next;
				ne1 = ne1.next;
			}

		}
		if (poly1 == 'A' && poly2 == 'A') {
			Dnode nc1 = Ac.head;
			Dnode ne1 = Ae.head;
			Dnode nc2 = Ac.head;
			Dnode ne2 = Ae.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc2.data + (int) nc1.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				}
			}

		}
		if (poly1 == 'B' && poly2 == 'B') {
			Dnode nc1 = Bc.head;
			Dnode ne1 = Be.head;
			Dnode nc2 = Bc.head;
			Dnode ne2 = Be.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc2.data + (int) nc1.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				}

			}

		}
		if (poly1 == 'C' && poly2 == 'C') {
			Dnode nc1 = Cc.head;
			Dnode ne1 = Ce.head;
			Dnode nc2 = Cc.head;
			Dnode ne2 = Ce.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc2.data + (int) nc1.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				}
			}

		}
		int[][] add = new int[Rc.size()][2];
		Dnode ncR = Rc.head;
		Dnode neR = Re.head;
		int c = 0;
		while (ncR != null) {
			add[c][0] = (int) ncR.data;
			add[c][1] = (int) neR.data;
			ncR = ncR.next;
			neR = neR.next;
			c++;
		}
		return add;
	}

	int[][] subtract(char poly1, char poly2) {
		Rc.clear();
		Re.clear();
		if ((poly1 == 'A' || poly2 == 'A') && Ac.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}
		if ((poly1 == 'B' || poly2 == 'B') && Bc.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}
		if ((poly1 == 'C' || poly2 == 'C') && Cc.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}
		if (poly1 == 'A' && poly2 == 'B') {
			Dnode nc1 = Ac.head;
			Dnode ne1 = Ae.head;
			Dnode nc2 = Bc.head;
			Dnode ne2 = Be.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc1.data - (int) nc2.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				} else if ((int) ne1.data > (int) ne2.data) {
					Re.add(ne1.data);
					Rc.add(nc1.data);
					nc1 = nc1.next;
					ne1 = ne1.next;
				} else if ((int) ne2.data > (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add(-1 * (int) nc2.data);
					nc2 = nc2.next;
					ne2 = ne2.next;
				}

			}
			if (nc1 == null && nc2 != null) {
				Re.add(ne2.data);
				Rc.add(-1 * (int) nc2.data);
				nc2 = nc2.next;
				ne2 = ne2.next;
			}
			if (nc2 == null && nc1 != null) {
				Re.add(ne1.data);
				Rc.add(nc1.data);
				nc1 = nc1.next;
				ne1 = ne1.next;
			}

		}
		if (poly1 == 'B' && poly2 == 'A') {
			Dnode nc2 = Ac.head;
			Dnode ne2 = Ae.head;
			Dnode nc1 = Bc.head;
			Dnode ne1 = Be.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc1.data - (int) nc2.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				} else if ((int) ne1.data > (int) ne2.data) {
					Re.add(ne1.data);
					Rc.add(nc1.data);
					nc1 = nc1.next;
					ne1 = ne1.next;
				} else if ((int) ne2.data > (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add(-1 * (int) nc2.data);
					nc2 = nc2.next;
					ne2 = ne2.next;
				}

			}
			if (nc1 == null && nc2 != null) {
				Re.add(ne2.data);
				Rc.add(-1 * (int) nc2.data);
				nc2 = nc2.next;
				ne2 = ne2.next;
			}
			if (nc2 == null && nc1 != null) {
				Re.add(ne1.data);
				Rc.add(nc1.data);
				nc1 = nc1.next;
				ne1 = ne1.next;
			}

		}
		if (poly1 == 'A' && poly2 == 'C') {
			Dnode nc1 = Ac.head;
			Dnode ne1 = Ae.head;
			Dnode nc2 = Cc.head;
			Dnode ne2 = Ce.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc1.data - (int) nc2.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				} else if ((int) ne1.data > (int) ne2.data) {
					Re.add(ne1.data);
					Rc.add(nc1.data);
					nc1 = nc1.next;
					ne1 = ne1.next;
				} else if ((int) ne2.data > (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add(-1 * (int) nc2.data);
					nc2 = nc2.next;
					ne2 = ne2.next;
				}

			}
			if (nc1 == null && nc2 != null) {
				Re.add(ne2.data);
				Rc.add(-1 * (int) nc2.data);
				nc2 = nc2.next;
				ne2 = ne2.next;
			}
			if (nc2 == null && nc1 != null) {
				Re.add(ne1.data);
				Rc.add(nc1.data);
				nc1 = nc1.next;
				ne1 = ne1.next;
			}

		}
		if (poly1 == 'C' && poly2 == 'A') {
			Dnode nc1 = Cc.head;
			Dnode ne1 = Ce.head;
			Dnode nc2 = Ac.head;
			Dnode ne2 = Ae.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc1.data - (int) nc2.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				} else if ((int) ne1.data > (int) ne2.data) {
					Re.add(ne1.data);
					Rc.add(nc1.data);
					nc1 = nc1.next;
					ne1 = ne1.next;
				} else if ((int) ne2.data > (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add(-1 * (int) nc2.data);
					nc2 = nc2.next;
					ne2 = ne2.next;
				}

			}
			if (nc1 == null && nc2 != null) {
				Re.add(ne2.data);
				Rc.add(-1 * (int) nc2.data);
				nc2 = nc2.next;
				ne2 = ne2.next;
			}
			if (nc2 == null && nc1 != null) {
				Re.add(ne1.data);
				Rc.add(nc1.data);
				nc1 = nc1.next;
				ne1 = ne1.next;
			}

		}
		if (poly1 == 'B' && poly2 == 'C') {
			Dnode nc1 = Bc.head;
			Dnode ne1 = Be.head;
			Dnode nc2 = Cc.head;
			Dnode ne2 = Ce.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc1.data - (int) nc2.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				} else if ((int) ne1.data > (int) ne2.data) {
					Re.add(ne1.data);
					Rc.add(nc1.data);
					nc1 = nc1.next;
					ne1 = ne1.next;
				} else if ((int) ne2.data > (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add(-1 * (int) nc2.data);
					nc2 = nc2.next;
					ne2 = ne2.next;
				}

			}
			if (nc1 == null && nc2 != null) {
				Re.add(ne2.data);
				Rc.add(-1 * (int) nc2.data);
				nc2 = nc2.next;
				ne2 = ne2.next;
			}
			if (nc2 == null && nc1 != null) {
				Re.add(ne1.data);
				Rc.add(nc1.data);
				nc1 = nc1.next;
				ne1 = ne1.next;
			}

		}
		if (poly1 == 'C' && poly2 == 'B') {
			Dnode nc1 = Cc.head;
			Dnode ne1 = Ce.head;
			Dnode nc2 = Bc.head;
			Dnode ne2 = Be.head;
			while (nc1 != null && nc2 != null) {
				if ((int) ne2.data == (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add((int) nc1.data - (int) nc2.data);
					nc1 = nc1.next;
					nc2 = nc2.next;
					ne1 = ne1.next;
					ne2 = ne2.next;
				} else if ((int) ne1.data > (int) ne2.data) {
					Re.add(ne1.data);
					Rc.add(nc1.data);
					nc1 = nc1.next;
					ne1 = ne1.next;
				} else if ((int) ne2.data > (int) ne1.data) {
					Re.add(ne2.data);
					Rc.add(-1 * (int) nc2.data);
					nc2 = nc2.next;
					ne2 = ne2.next;
				}

			}
			if (nc1 == null && nc2 != null) {
				Re.add(ne2.data);
				Rc.add(-1 * (int) nc2.data);
				nc2 = nc2.next;
				ne2 = ne2.next;
			}
			if (nc2 == null && nc1 != null) {
				Re.add(ne1.data);
				Rc.add(nc1.data);
				nc1 = nc1.next;
				ne1 = ne1.next;
			}

		}
		if ((poly1 == 'A' && poly2 == 'A') || (poly1 == 'B' && poly2 == 'B') || (poly1 == 'C' && poly2 == 'C')) {
			int[][] sub1 = new int[1][1];
			sub1[0][0] = 0;
			return sub1;
		}
		int[][] sub = new int[Rc.size()][2];
		Dnode ncR = Rc.head;
		Dnode neR = Re.head;
		int c = 0;
		while (ncR != null) {
			sub[c][0] = (int) ncR.data;
			sub[c][1] = (int) neR.data;
			ncR = ncR.next;
			neR = neR.next;
			c++;
		}
		return sub;
	}

	int[][] multiply(char poly1, char poly2) {
		Rc.clear();
		Re.clear();
		if ((poly1 == 'A' || poly2 == 'A') && Ac.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}
		if ((poly1 == 'B' || poly2 == 'B') && Bc.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}
		if ((poly1 == 'C' || poly2 == 'C') && Cc.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}
		if ((poly1 == 'A' && poly2 == 'B') || (poly1 == 'B' && poly2 == 'A')) {
			Dnode nc1 = Ac.head;
			Dnode ne1 = Ae.head;

			while (nc1 != null) {
				Dnode nc2 = Bc.head;
				Dnode ne2 = Be.head;
				while (nc2 != null) {
					Re.add((int) ne1.data + (int) ne2.data);
					Rc.add((int) nc1.data * (int) nc2.data);
					ne2 = ne2.next;
					nc2 = nc2.next;
				}
				nc1 = nc1.next;
				ne1 = ne1.next;
			}
		}
		if ((poly1 == 'B' && poly2 == 'C') || (poly1 == 'C' && poly2 == 'B')) {
			Dnode nc1 = Bc.head;
			Dnode ne1 = Be.head;

			while (nc1 != null) {
				Dnode nc2 = Cc.head;
				Dnode ne2 = Ce.head;
				while (nc2 != null) {
					Re.add((int) ne1.data + (int) ne2.data);
					Rc.add((int) nc1.data * (int) nc2.data);
					ne2 = ne2.next;
					nc2 = nc2.next;
				}
				nc1 = nc1.next;
				ne1 = ne1.next;
			}
		}
		if ((poly1 == 'A' && poly2 == 'C') || (poly1 == 'C' && poly2 == 'A')) {
			Dnode nc1 = Ac.head;
			Dnode ne1 = Ae.head;

			while (nc1 != null) {
				Dnode nc2 = Cc.head;
				Dnode ne2 = Ce.head;
				while (nc2 != null) {
					Re.add((int) ne1.data + (int) ne2.data);
					Rc.add((int) nc1.data * (int) nc2.data);
					ne2 = ne2.next;
					nc2 = nc2.next;
				}
				nc1 = nc1.next;
				ne1 = ne1.next;
			}
		}
		if (poly1 == 'A' && poly2 == 'A') {
			Dnode nc1 = Ac.head;
			Dnode ne1 = Ae.head;

			while (nc1 != null) {
				Dnode nc2 = Ac.head;
				Dnode ne2 = Ae.head;
				while (nc2 != null) {
					Re.add((int) ne1.data + (int) ne2.data);
					Rc.add((int) nc1.data * (int) nc2.data);
					ne2 = ne2.next;
					nc2 = nc2.next;
				}
				nc1 = nc1.next;
				ne1 = ne1.next;
			}
		}
		if (poly1 == 'B' && poly2 == 'B') {
			Dnode nc1 = Bc.head;
			Dnode ne1 = Be.head;

			while (nc1 != null) {
				Dnode nc2 = Bc.head;
				Dnode ne2 = Be.head;
				while (nc2 != null) {
					Re.add((int) ne1.data + (int) ne2.data);
					Rc.add((int) nc1.data * (int) nc2.data);
					ne2 = ne2.next;
					nc2 = nc2.next;
				}
				nc1 = nc1.next;
				ne1 = ne1.next;
			}
		}
		if (poly1 == 'C' && poly2 == 'C') {
			Dnode nc1 = Cc.head;
			Dnode ne1 = Ce.head;

			while (nc1 != null) {
				Dnode nc2 = Cc.head;
				Dnode ne2 = Ce.head;
				while (nc2 != null) {
					Re.add((int) ne1.data + (int) ne2.data);
					Rc.add((int) nc1.data * (int) nc2.data);
					ne2 = ne2.next;
					nc2 = nc2.next;
				}
				nc1 = nc1.next;
				ne1 = ne1.next;
			}
		}
		int[][] multiply = new int[Rc.size()][2];
		Dnode ncR = Rc.head;
		Dnode neR = Re.head;
		int c = 0;
		while (ncR != null) {
			multiply[c][0] = (int) ncR.data;
			multiply[c][1] = (int) neR.data;
			ncR = ncR.next;
			neR = neR.next;
			c++;
		}
		Sort(multiply);
		int[][] m = new int[multiply.length][2];
		for (int i = 0; i < multiply.length; i++) {
			m[i][0] = multiply[i][0];
			m[i][1] = multiply[i][1];
			for (int j = i + 1; j < multiply.length; j++) {
				if (multiply[i][1] == multiply[j][1]) {
					m[i][0] = multiply[i][0] + multiply[j][0];
					i = j;
				}
			}
		}
		int v = 0;
		for (int k = 0; k < m.length; k++) {
			if (m[k][0] != 0) {
				v++;
			}
		}
		int[][] m1 = new int[v][2];
		int v1 = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i][0] != 0) {
				m1[v1][0] = m[i][0];
				m1[v1++][1] = m[i][1];
			}
		}
		return m1;
	}

	String print(char poly) {
		if (poly == 'A' && Ac.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}
		if (poly == 'B' && Bc.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}
		if (poly == 'C' && Cc.head.data == null) {
			System.out.println("variable not set !");
			return null;
		}
		String p = new String();
		if (poly == 'A') {
			Dnode nc = Ac.head;
			Dnode ne = Ae.head;
			if (nc.data == null)
				return null;
			while (nc != null) {

				if (nc.next == null) {
					if ((int) ne.data == 1) {
						p += Integer.toString((int) nc.data) + "x";

					} else if ((int) ne.data == 0) {
						p += Integer.toString((int) nc.data);
					} else
						p += Integer.toString((int) nc.data) + "x" + "^" + Integer.toString((int) ne.data);
				} else if ((int) ne.data == 1) {
					p += Integer.toString((int) nc.data) + "x" + "+";

				} else if ((int) ne.data == 0) {
					p += Integer.toString((int) nc.data) + "+";
				} else
					p += Integer.toString((int) nc.data) + "x" + "^" + Integer.toString((int) ne.data) + "+";
				ne = ne.next;
				nc = nc.next;
			}
			return p;
		} else if (poly == 'B') {
			Dnode nc = Bc.head;
			Dnode ne = Be.head;
			if (nc.data == null)
				return null;
			while (nc != null) {
				if (nc.next == null) {
					if ((int) ne.data == 1) {
						p += Integer.toString((int) nc.data) + "x";

					} else if ((int) ne.data == 0) {
						p += Integer.toString((int) nc.data);
					} else
						p += Integer.toString((int) nc.data) + "x" + "^" + Integer.toString((int) ne.data);
				} else if ((int) ne.data == 1) {
					p += Integer.toString((int) nc.data) + "x" + "+";

				} else if ((int) ne.data == 0) {
					p += Integer.toString((int) nc.data) + "+";
				} else
					p += Integer.toString((int) nc.data) + "x" + "^" + Integer.toString((int) ne.data) + "+";
				ne = ne.next;
				nc = nc.next;
			}
			return p;
		} else if (poly == 'C') {
			Dnode nc = Cc.head;
			Dnode ne = Ce.head;
			if (nc.data == null)
				return null;
			while (nc != null) {
				if (nc.next == null) {
					if ((int) ne.data == 1) {
						p += Integer.toString((int) nc.data) + "x";

					} else if ((int) ne.data == 0) {
						p += Integer.toString((int) nc.data);
					} else
						p += Integer.toString((int) nc.data) + "x" + "^" + Integer.toString((int) ne.data);
				} else if ((int) ne.data == 1) {
					p += Integer.toString((int) nc.data) + "x" + "+";

				} else if ((int) ne.data == 0) {
					p += Integer.toString((int) nc.data) + "+";
				} else
					p += Integer.toString((int) nc.data) + "x" + "^" + Integer.toString((int) ne.data) + "+";
				ne = ne.next;
				nc = nc.next;
			}
			return p;
		} else {
			return null;
		}
	}

	void clearPolynomial(char poly) {
		if (poly == 'A') {
			Ac.clear();
			Ae.clear();
		} else if (poly == 'B') {
			Bc.clear();
			Be.clear();
		} else if (poly == 'C') {
			Cc.clear();
			Ce.clear();
		}
	}

	float evaluatePolynomial(char poly, float value) {
		if (poly == 'A' && Ac.head.data == null) {
			System.out.println("variable not set !");
			return 0;
		}
		if (poly == 'B' && Bc.head.data == null) {
			System.out.println("variable not set !");
			return 0;
		}
		if (poly == 'C' && Cc.head.data == null) {
			System.out.println("variable not set !");
			return 0;
		}
		float p = 0;
		if (poly == 'A') {
			Dnode nc = Ac.head;
			Dnode ne = Ae.head;
			int n_e = (int) ne.data;
			int n_c = (int) nc.data;

			while (ne != null) {
				p += Math.pow(value, n_e) * (n_c);
				ne = ne.next;
				nc = nc.next;
			}
			return p;
		} else if (poly == 'B') {
			Dnode nc = Bc.head;
			Dnode ne = Be.head;
			while (ne != null) {
				p += Math.pow((double) value, (double) ne.data) * (double) (nc.data);
				ne = ne.next;
				nc = nc.next;
			}
			return p;
		} else {
			Dnode nc = Cc.head;
			Dnode ne = Ce.head;
			while (ne != null) {
				p += (float) (Math.pow((double) value, (double) ne.data) * (double) (nc.data));
				ne = ne.next;
				nc = nc.next;
			}
			return p;

		}
	}
}
