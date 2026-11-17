
public class Method_07{

	static void m1() {
		System.out.println("M1 method called");
	}
	
	static int m2() {
		System.out.println("M2 method called");
		return 10;
	}
	
	static void m3(int p) {
		System.out.println("M3 method called");
		System.out.println(100+p);
	}
	
	static int m4() {
		return m5() ;
	}
    static int m5() {
    	return 343;	
	}
	public static void main(String[] args) {
		System.out.println("Main method START"); //Main method START
		 m1(); //M1 method called
		 m2(); //first it prints "M2 method called" and and m2() method returns value 10
		 int res=m2(); //first it prints "M2 method called" and returned value stored into variable res
		 int res1=50+ m2();
		 System.out.println(m2());
		 System.out.println(res+" "+res1);//10  60
		 m3(m2());
		 
		 int perplexedResult=m4();
		 System.out.println(perplexedResult);
		System.out.println("Main method END");
	}
}
