import java.util.Scanner;
class Example{
	
	static boolean evenOrOdd(int p) {
		int res=p%2;
		if(res==0) {
		return true;	
		}else {
			return false;
		}
	}
	
	static String checkEvenOrOdd(boolean res) {
		if(res) {
			return "Even";
		}else {
			return "Odd";
		}
	}
}

public class Method_08 {

	public static void main(String[] args) {
		System.out.println("Main method starts");
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=scn.nextInt();
		 boolean res=Example.evenOrOdd(num);
		 System.out.println("The given number "+num+" is "+ Example.checkEvenOrOdd(res));
	}


}
