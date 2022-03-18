package CaseOne;

import java.util.LinkedList;

public class IntersectingNodes {

	public static void main(String[] args) {
		
		LinkedList<Integer> link1 = new LinkedList<>();
		
		link1.add(3);
		link1.add(7);
		link1.add(9);		
		link1.add(10);
		
		LinkedList<Integer> link2 = new LinkedList<>();
		
		link2.add(99);
		link2.add(2);
		link2.add(8);
		link2.add(10);
		
		if (link1.size() == link2.size()) {
			for(int l = 0; l < link1.size(); l++) {
				if (link1.get(l) == link2.get(l)) {
					System.out.println(link1.get(l));
					break;
				}
			}
		}
	}
}
