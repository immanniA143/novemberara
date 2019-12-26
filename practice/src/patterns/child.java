package patterns;

public class child extends parrent{
	public static void m1() {
		System.out.println("i am m1 from child");
	}
	public static void main(String[] args) {
		m1();
		parrent.m1();
	}

}
