package SimplePrograms;

public class Interface {

	public static void main(String[] args) {
		System.out.println("this is basic");
		itest i1=new six();
		i1.display();
	}

}
interface itest{
	public void display();
}
class six implements itest{
	public void display() {
		System.out.println("this is display");
	}
}