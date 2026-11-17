
public class Method_06 {
static void m1() {
	                  //We can create an empty method as it is a void method
}


static int m2() {
	
//	return 5;     //Return statement is mandatory
	return 'a';   //Multiple return statements are not allowed
//	return 5l;
//	return 4.5;  //Exact or lesser data type values are only  allowed 
//	return true;
}

 static int m3() {
	  return 25;
  }

public static void main(String[] args) {
	System.out.println("Welcome to java backend world");
	
	//System.out.println(m1());//not allowed
	
	
	// we can call methods in different statements
	// 1)m3(); --------------->As a single statement
	// 2)int a=m3();---------->As a variable assignment
	// 3)int result=25*m3();--->As an operand in expression
	// 4)SOPLN(m3())----------->As a method argument
	//       m2(m3())
	 
	/*5) int m4(){
	      return m3();------------>As a method return value
	     }  
	 */          
}
}
