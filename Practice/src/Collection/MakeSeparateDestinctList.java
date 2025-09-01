package Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MakeSeparateDestinctList {
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add(40);
		arrList.add(10);

//   System.out.println(new ArrayList<>(new LinkedHashSet<>(arrList)));
		System.out.println(arrList);
		System.out.println("=========================");
		Set<Integer> s1 = new LinkedHashSet<>(arrList);
//		System.out.println(s1);
		System.out.println(new ArrayList<Integer>(s1));

	}
}
