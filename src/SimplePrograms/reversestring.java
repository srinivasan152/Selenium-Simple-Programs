package SimplePrograms;

public class reversestring {

	public static void main(String[] args) {
		String actual="srinivasan";
		int ln=actual.length();
		char arr[]=actual.toCharArray();
		for (int i = ln-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}
