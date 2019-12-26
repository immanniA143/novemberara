package patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vectors1 {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		vec.add("hgvhf");
		vec.add("sfdg");
		List<String> lis=new ArrayList<String>();
		lis.add("bhhhgg");
		lis.add("jsfj");
		vec.addAll(lis);
		System.out.println(vec);
		String[] copyvc=new String[vec.size()];
		vec.copyInto(copyvc);
		for(String str:copyvc)
			System.out.println(str);
		List<String> sublis=vec.subList(1, 3);
		System.out.println(sublis);
	}

}
