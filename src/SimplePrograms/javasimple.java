package SimplePrograms;

public class javasimple {

	public static void main(String[] args) {
		System.out.println("this is basic");
		one o1=new one();
		o1.chennai();
		o1.cbe();
		two.bangalore();
		two.erode();
		//five f2=new five();
		//five f3=new five(20, 30);
	
	}

}
class one {
	public void chennai() {
		System.out.println("this is chennai");
	}
	public void cbe() {
		System.out.println("this is cbe");
	}
}
class two{
	public static void bangalore() {
		System.out.println("this is bangalore");
	}
	public static void erode() {
		System.out.println("this is erode ");
	}
}
class five{
	 five() {
		System.out.println("this is five");
	}
	 five(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
}