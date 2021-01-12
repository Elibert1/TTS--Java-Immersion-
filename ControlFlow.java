import java.util.Scanner;
public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("What is your name:");
		String firstName = input.nextLine();
		System.out.printf("Hello" + firstName);
	
		public static void printNumbers(){
			for(i = 48 ; i < 58; i++){
			String n = Character.toString((char) i);
			System.out.println(n);
			}
		}
		public static void printLowerCase(){
			for(i = ; ; i++;){
			String n = Character.toString((char) i);
			System.out.println(n);
			}
		}
		public static void printUpperCase(){
			for(i = 58; i < 94 ; i++){
			String n = Character.toString((char) i);
			System.out.println(n);
			}
		}
	}
public static void main (String[] args){
	
	AsciiChars.printNumbers();
	AsciiChars.printUpperCaseLetters();
	AsciiChars.printLowerCaseLetters();
	
	Scanner scanner = new Scanner(System.in);
	string answer = 'Yes' || 'Y';
	System.out.println("Would you like to continue to the interactive portion?");
	string userInput = string.parsevar(userInput.nextLine());
	if(userInput.equals(answer)){
//From an organizational standpoint, make a function for these questions.
		Scanner scanner = new Scanner(System.in);
		System.out.println("What color is your car?");
		String color = scanner.nextLine();
		System.out.println("What is your favorite pet?");
		String pet = scanner.nextLine();
		System.out.println("What is your lucky number?");
		String number = scanner.nextLine();
		System.out.println("Do you have a favorite quarterback? yes or no.")
		string yesorno = scanner.nextLine();
		if (yesorno.startsWith('yes' || 'y')){
			system.out.println("what is their jersey number?")
			String jersey = scanner.nextLine();
		}
		System.out.println("What is two-digit model year of your car?")
		int caryear = scanner.nextLine();
	}else{
		System.out.printf("");
		System.exit(0);
	}
	}
}