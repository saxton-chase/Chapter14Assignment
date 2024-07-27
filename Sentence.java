import java.util.Scanner;
public class Sentence {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String userString= "";
		int length = 0;
		
		System.out.print("Enter a sentence: ");
		userString = userInput.nextLine();
		
		String[] splitString = userString.split(" ");
		length = splitString.length;
		
		for(int i = length-1; i != -1; i--) {
			System.out.println(splitString[i]);
		}
	}

}
