import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Find out the char code of your name!
		//There is a difference between uppercase and lowercase letters.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");

		String name = sc.nextLine();
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i)+",");
		}
	
	
		System.out.println("*********");
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println(",");
			System.out.print(name.codePointAt(i));
		}

	}

}
