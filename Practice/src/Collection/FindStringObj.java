package Collection;

import java.util.ArrayList;
import java.util.List;

public class FindStringObj {
	public static void main(String[] args) {
		List<Object> arrList = new ArrayList<Object>();
		arrList.add(123);
		arrList.add(true);
		arrList.add("abc");
		arrList.add(10.05);
		arrList.add(11.05F);
		arrList.add('a');

		for (Object object : arrList) {
			if (object instanceof String)
				System.out.println(object);
		}

		System.out.println("==========================");

		for (int i = 0; i < arrList.size(); i++) {
			if (arrList.get(i) instanceof String)
				System.out.println(arrList.get(i));
		}

	}
}
