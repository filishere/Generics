package recursion;

public class GenericStack<E> {
	@SuppressWarnings("unchecked")
	private E[] list = (E[]) new Object[3];
	private int size = 0;

	public GenericStack() {

	}

	public int getSize() {
		return size;
	}

	public E peek() {
		return list[size - 1];
	}

	public void push(E o) {
		if (size >= list.length ) {
			doubleList();
		}

		list[size] = o;
		size++;
	}

	public E pop() {
		size--;
		E o = list[size];
		return o;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	private void doubleList () {
		@SuppressWarnings("unchecked")
		E[] newList = (E[]) new Object[getSize() * 2];
		System.arraycopy(list, 0, newList, 0, list.length);
		list = newList;
	}

	public String toString() {
		return "stack: " + list.toString();
	}
}
