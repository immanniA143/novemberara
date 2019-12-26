package patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListpra {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("sdhag");
		al.add("fsddft");
		al.add("afdg");
		al.add("sfbs");
		al.add("hfs");
		System.out.println(al.get(1));
		System.out.println(al.contains("sfbs"));
		al.add(2,"aravind");
		System.out.println(al.get(2));
		ArrayList<String> copy=(ArrayList<String>) al.clone();
		System.out.println(copy);
		List<String> l= new ArrayList<String>();
		l.add("immanni");
		l.add("usha");
		al.addAll(l);
		System.out.println(al);
		System.out.println(al.containsAll(l));
		String[] str=new String[al.size()];
		al.toArray(str);
		for(String st:str)
			System.out.println(st);
		System.out.println(al.subList(2, 6));
		Collections.reverse(al);
		for(String stri:al)
			System.out.println(stri);
		Collections.shuffle(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		Collections.swap(al, 2, 5);
		System.out.println(al);
		
	}

}
