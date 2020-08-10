package week6;

public class game101 {
	String br="black Diamond";
	static int age =10;
	static String cat = "JR";
	public static void main(String[]args) {
		//body of method
		//using local variable age outside it's scope
		String owner = "tommy";//local variable owner 
		game101 obj = new game101();
		System.out.println("The name of is "+ cat +"and Tommy is :"+ owner  );	
		cat();
	}
	public static void cat() {
		//body of sub method age
		//local variable age
		age = 1;
		age = age+5;
		System.out.println(age);
	}
	public void display() {
		System.out.println(br);
	}
}
