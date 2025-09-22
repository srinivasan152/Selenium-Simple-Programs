package SimplePrograms;

public class parameter {

	public static void main(String[] args) {
		System.out.println("this is basic");
		three t2= new three();
		t2.add(20, 30);
		t2.multiplication(3, 3);
		t2.erode();
		four f1 = new four();
		int ab=f1.add(2, 5);
		System.out.println(ab);
		int cd=f1.multiplication(2, 9);
		System.out.println(cd);
		f1.chennai();
		
		
	}

}
class three{
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
		
	}
	public void multiplication(int a,int b) {
		int c=a*b;
		System.out.println(c);
	}
	public void erode() {
		System.out.println("this is erode");
	}
	
}
class four{
	public int add(int a, int b) {
		int d=a+b;
		return d;
	}
	public int multiplication(int a, int b) {
		int e=a*b;
		return e;
	}
	public void chennai() {
		System.out.println("this is chenai");
	}
}