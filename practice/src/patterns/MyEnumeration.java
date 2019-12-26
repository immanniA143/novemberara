package patterns;

import java.util.Enumeration;
import java.util.Vector;

public class MyEnumeration {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		Enumeration<String> en=null;
		String deleteElement="aravind";
		vec.add("arav");
		vec.add("aravi");
		vec.add("aravind");
		vec.add("imma");
		en=vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
			 
		}
	}
}
