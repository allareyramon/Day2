package Excecise1;

public class excercise1_main {

	public static void main(String[] args) {
		base2 b2 = new base2();
		base1 b1 = b2;
		
		b1.method1();
	}

}


class base1
{
	public void method1() {
		method2();
		
	}
	
	public void method2() {
		System.out.println("wazza");
	}
}
class base2 extends base1{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
	
		System.out.println("check");
	}

}
	

// upcasting the value of base 2 to base 1 makes the base1=base2
//so output is the the overrided class
