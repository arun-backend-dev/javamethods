

/*
 * ✅ What is a private method?

A private method is a method that can be accessed only within the same class where it is defined.
No other class — not even subclasses — can call or use a private method.
It is used for internal logic, helper operations, and to hide implementation details from outside code.
Private methods ensure encapsulation by preventing other classes from misusing internal functionality.
*/

// ✅ Rules of Private Methods
 
//1. Private methods are accessible only inside the same class.
//No other class can call or access them — not even subclasses.

//2. Private methods cannot be overridden.
//Because subclasses cannot see the private method, they cannot override it.
    //But you can declare another method with the same name in a subclass — this is method hiding, not overriding


//3. Private methods can be called only from within the class.
  //You must call them using:
        //another method in the same class
       //or directly inside the class
       //Never from outside.

//4. Private methods can access both static and instance members.

//They behave just like normal methods — only access is restricted.

class ExampleMethod{
	private static void m1() {
		System.out.println("Private method is called");
	}
	static void m2() {
		System.out.println("m2");
	}
    static void m3() {
		System.out.println("m3");
		m1();
	}	
}

public class Method_04 {

	public static void main(String[] args) {
	//	ExampleMethod.m1();//The method m1() from the type ExampleMethod is not visible
		ExampleMethod em1=new ExampleMethod();
	//	em1.m1();//The method m1() from the type ExampleMethod is not visible//Even though we create an object we can not directly call private methods from another class
		
		
		//Right way calling private method 
		em1.m3();//m3,Private method is called
	}
	
}




























