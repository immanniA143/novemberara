package patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections1 {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("java");
		mylist.add("python");
		mylist.add("jfk");
		mylist.add("indira");
		System.out.println(mylist);
		Iterator<String> itr=mylist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String str: mylist) 
			System.out.println(str);
		mylist.remove("java");
		System.out.println(mylist);
	}

}
