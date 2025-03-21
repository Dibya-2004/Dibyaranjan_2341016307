package polimorphism;
class MathOperations{
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	double add(int a,double b) {
		double c=a+b;
		return c;
	}
	double add(double a,int b) {
		double c=a+b;
		return c;
	}
	double add(double a,double b) {
		double c=a+b;
		return c;
	}
	int substract(int a,int b) {
		int c=a-b;
		return c;
	}
	double substract(int a,double b) {
		double c=a-b;
		return c;
	}
	double stnstract(double a,int b) {
		double c=a-b;
		return c;
	}
	double substract(double a,double b) {
		double c=a-b;
		return c;
	}
	int multiply(int a,int b) {
		int c=a*b;
		return c;
	}
	double multiply(int a,double b) {
		double c=a*b;
		return c;
	}
	double multiply(double a,int b) {
		double c=a*b;
		return c;
	}
	double multiply(double a,double b) {
		double c=a*b;
		return c;
	}
	double division(int a,int b) {
		if(b==0) {
			System.out.println("Invalid input");
			return Double.NaN;
		}
		int c=a/b;
		return c;
	}
	double division(int a,double b) {
		if(b==0) {
			System.out.println("Invalid input");
			return Double.NaN;
		}
		double c=a/b;
		return c;
	}
	double division(double a,int b) {
		if(b==0) {
			System.out.println("Invalid input");
			return Double.NaN;
		}
		double c=a/b;
		return c;
	}
	double division(double a,double b) {
		if(b==0) {
			System.out.println("Invalid input");
			return Double.NaN;
		}
		double c=a/b;
		return c;
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations mo=new MathOperations();
		System.out.println(mo.add(1,1 ));
		System.out.println(mo.add(1,11.9 ));
		System.out.println(mo.add(1.9,1 ));
		System.out.println(mo.add(10.2,17.9 ));
		
		System.out.println(mo.substract(1,1 ));
		System.out.println(mo.substract(1,11.9 ));
		System.out.println(mo.substract(1.9,1 ));
		System.out.println(mo.substract(10.2,17.9 ));
		
		System.out.println(mo.multiply(1,1 ));
		System.out.println(mo.multiply(1,11.9 ));
		System.out.println(mo.multiply(1.9,1 ));
		System.out.println(mo.multiply(10.2,17.9 ));
		
		System.out.println(mo.division(1,1 ));
		System.out.println(mo.division(1,11.9 ));
		System.out.println(mo.division(1.9,1 ));
		System.out.println(mo.division(10.2,17.9 ));
	}
}
