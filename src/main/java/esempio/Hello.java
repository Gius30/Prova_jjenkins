package esempio;

public class Hello {
	public String sayHello() {
		return "Hello, Jenkins!";
	}

	public static void main(String[] args) {
		System.out.println(new Hello().sayHello());
	}
}
