package testPacakge;

public class TestClass {
	
	int age=20;
	String name="Babu";
	String gender="Male";

public int myAgeInMonths(int years) {
	
	int months= years*12;
	
	return months;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestClass obj=new TestClass();
		System.out.println(obj.myAgeInMonths(obj.age));

	}

}
