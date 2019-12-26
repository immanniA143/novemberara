package patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collections2 {
	public static void main(String[] args) {
		List <String> li=new ArrayList<String>();
		String deleteElement ="ara";
		li.add("hshff");
		li.add("ara");
		li.add("jsaf");
		System.out.println("before removing"+li);
		Iterator<String> it=li.iterator();
		ListIterator<String> liit=li.listIterator();
		  while(liit.hasNext()) { System.out.println(liit.next()); }
		while(liit.hasPrevious()) {
			System.out.println(liit.previous());
		}
		while(it.hasNext())
		{
			if(deleteElement.equals(it.next()))
				it.remove();
		}
		System.out.println("after removing"+li);
	}
}
