package sh2;

public class MySpecialLinkedListUtils {
	public static double[] summary(LinkedListNode head) {
		double sum = 0;
		LinkedListNode node = new LinkedListNode();
		node = head;
		while (node != null) {
			sum += node.value;
			node = node.next;
		}

		int size = 0;
		node = head;
		while (node != null) {
			size++;
			node = node.next;
		}

		double av = 0;
		node = head;
		while (node != null) {
			av += ((double) node.value / size);
			node = node.next;
		}

		double md = 0;
		node = head;
		LinkedListNode f = new LinkedListNode();
		int n = 0;
		while (n != size / 2) {
			node = node.next;
			n++;
			if (n == size / 2 - 1) {
				f = node;
			}
		}
		if (size % 2 == 1) {
			md = (double)node.value;
		} else {
			md = (double)((node.value + f.value) / 2.0);
		}

		double max;
		node = head;
		max = (double) node.value;
		while (node != null) {
			if (node.value > max) {
				max = node.value;
			}
			node = node.next;
		}

		double min;
		node = head;
		min = (double) node.value;
		while (node != null) {
			if (node.value < min) {
				min = node.value;
			}
			node = node.next;
		}

		double[] B = new double[5];
		B[0] = sum;
		B[1] = av;
		B[2] = md;
		B[3] = max;
		B[4] = min;

		return B;

	}

	public static LinkedListNode reverse(LinkedListNode head) {
		LinkedListNode current = head;
		LinkedListNode next;
		LinkedListNode prev = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public static LinkedListNode evenIndexedElements(LinkedListNode head) {
		LinkedListNode node = head;
		int size = 0;
		while (node != null) {
			size++;
			node = node.next;
		}

		node = head;
		int[] A = new int[size];
		int counter = 0;
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				A[counter++] = node.value;
			}
			node = node.next;
		}

		node = head;
		for (int i = 0; i < counter; i++) {
			if (i == counter - 1)
				node.next = null;
			node.value = A[i];
			node = node.next;
		}
		node = head;
		return node;
	}

	public static LinkedListNode insertionSort(LinkedListNode head) {
		LinkedListNode node = head;
		int size = 0;
		while (node != null) {
			size++;
			node = node.next;
		}
		node = head;
		int[] A = new int[size];
		for (int i = 0; i < size; i++) {
			A[i] = node.value;
			node = node.next;
		}
		int temp;
		int j;
		for (int i = 1; i < size; i++) {
			temp = A[i];
			for (j = i; j > 0 && temp < A[j - 1]; j--) {
				A[j] = A[j - 1];
			}
			A[j] = temp;
		}

		node = head;
		for (int i = 0; i < size; i++) {
			if (i == size - 1)
				node.next = null;
			node.value = A[i];
			node = node.next;
		}

		node = head;
		return node;
	}

	public static LinkedListNode mergeSort(LinkedListNode head) {
		LinkedListNode node = head;
		int size = 0;
		while (node != null) {
			size++;
			node = node.next;
		}
		node = head;
		int[] A = new int[size];
		for (int i = 0; i < size; i++) {
			A[i] = node.value;
			node = node.next;
		}
		sort(A, 0, A.length - 1);
		node = head;
		for (int i = 0; i < size; i++) {
			if (i == size - 1)
				node.next = null;
			node.value = A[i];
			node = node.next;
		}
		node = head;
		return node;

	}

	public static void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int A[] = new int[n1];
		int B[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			A[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			B[j] = arr[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (A[i] <= B[j]) {
				arr[k] = A[i];
				i++;
			} else {
				arr[k] = B[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = A[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = B[j];
			j++;
			k++;
		}
	}

	public static void sort(int arr[], int low, int high) {
		if (low < high) {
			int m = (low + high) / 2;
			sort(arr, low, m);
			sort(arr, m + 1, high);
			merge(arr, low, m, high);
		}
	}

	public static LinkedListNode removeCentralNode(LinkedListNode head) {
		LinkedListNode node = head;
		int size = 0;
		while (node != null) {
			size++;
			node = node.next;
		}

		int counter = 0;
		node = head;
		if (size % 2 == 1) {
			while (counter < size / 2 - 1) {
				node = node.next;
				counter++;
			}
			node.next = node.next.next;
		} else {
			while (counter < ((size - 1) / 2) - 1) {
				node = node.next;
				counter++;
			}
			node.next = node.next.next;
		}
		node = head;
		return node;
	}

	public static boolean palindrome(LinkedListNode head) {
		LinkedListNode node = head;
		int size = 0;
		while (node != null) {
			size++;
			node = node.next;
		}
		node = head;
		int[] A = new int[size];
		for (int i = 0; i < size; i++) {
			A[i] = node.value;
			node = node.next;
		}

		for (int i = 0, j = size - 1; i < size && j > 0 && i != j; i++, j--) {
			if (A[i] == A[j]) {
				continue;
			} else
				return false;
		}
		return true;
	}

}
