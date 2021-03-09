package recursion;

import java.util.ArrayList;

public class GenericsArrayList<E> {

	public ArrayList<E> list;

	public static <E> void shuffle(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++) {
                  int randIndex = (int)(Math.random()*list.size());
		E temp = list.get(i);
		list.set(i, list.get(randIndex));
		list.set(randIndex, temp);
}

	}
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E currentMin;                             
				int currentMinIndex;


				for (int i = 0; i < list.size() - 1; i++) {
		
					currentMin = list.get(i);
					currentMinIndex = i;
					for (int j = i + 1; j < list.size(); j++) {
						if (currentMin.compareTo(list.get(j)) > 0) {
							currentMin = list.get(j);
							currentMinIndex = j;
						}
					}

					if (currentMinIndex != i) {
						list.set(currentMinIndex , list.get(i)) ;
						list.set(i, currentMin)  ;
					}
				}

	}

	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		E min = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (min.compareTo(list.get(i)) > 0) {
				min = list.get(i);
			}
		}
		return min;
	}

	
}

