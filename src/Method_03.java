
public class Method_03 {
	
	static int a=10;
	       int x=20;
	       
	 static void m1() { //Executed for current class common to all objects
		 a=15;
		 
	 }
	  void m2() {  //Executed for current object specific to this object
		 x=16;
		 
	 }
	  
	/*  ✔ a is static, so it belongs to the class, not to any object.
	  ✔ Instance methods (like m3()) are allowed to access and modify static variables.
	  ✔ So calling m3() using ANY object will update the same shared static variable a.
	*/  
	  void m3() {
		  a=529; 
	  }
	  
	  
	  public static void main(String[] args) {
		  Method_03 me1=new Method_03();
		  Method_03 me2=new Method_03();
		  
		  System.out.println(Method_03.a +" "+me1.a+" "+me2.a);// 10 10 10
		  me1.m1();
		  System.out.println(Method_03.a +" "+me1.a+" "+me2.a);// 15 15 15
		  
		  System.out.println(+me1.x+" "+me2.x); // 20 20
		  /*
		  me1.m2(); means you are calling the instance method m2() on the object me1.
          Because m2() is non-static, it runs only for that specific object and modifies only me1.x.
          So me1.x becomes 16, but me2.x remains 20 because each object has its own copy of x.
          In short: me1.m2() updates me1’s instance variable, not me2’s.
          me1.m2() changes only me1.x because the method runs on that object only
		   */
		  me1.m2();//
		  System.out.println(+me1.x+" "+me2.x); // 16 20
	}
}
