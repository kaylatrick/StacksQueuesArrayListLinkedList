package arraylist;

public class ArrayList {

	private Object[] things = new Object[0];
	private int size = 0;

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.set(23, 0);
		list.set(45, 1);
		list.set(73, 2);
		// Object test = get(1);
		// System.out.println(test);
		// System.out.println(size());
		list.append(1);
		list.append(2);
		// System.out.println(size());
		// System.out.println(things[3]);
		// System.out.println(things[4]);
		list.set(60, 5);
		// System.out.println(size());
		// System.out.println(things[5]);
		list.append(45);
		System.out.println(list.size());
		list.append(9);
		System.out.println(list.size());
		list.append(40);
		System.out.println(list.size());
		list.append(30);
		System.out.println(list.size());
		list.append(2);
		System.out.println(list.size());
		list.set(70, 5);
		System.out.println(list.size());
		System.out.println(list.get(5));

	}

	public Object get(int idx) { // this will return which Object is at that
									// index
		return this.things[idx];
	}

	public void set(Object obj, int idx) { // setting the object at that index
		if (idx >= this.things.length) {
			Object[] thingsNew = new Object[this.size + 5];
			for (int i = 0; i < this.size; i++) {
				thingsNew[i] = this.things[i];
			}
			this.things = thingsNew;
		}

		this.things[idx] = obj;

		if (idx >= this.size) {
			this.size++;
		}
		// System.out.println(size);
	}

	public void append(Object obj) { // add to the end of the array
		set(obj, this.size);
	}

	public int size() { // how many objects are there in the array list
						// currently?
		return this.size;
	}

}
