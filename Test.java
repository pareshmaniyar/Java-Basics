import java.util.Scanner;
class Test {
	public static void main( String [] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Double ");
		System.out.println("Your Double " + sc.nextDouble());
		System.out.println("Type String to trim ");
		String trimString = sc.nextLine();
		System.out.println("Your Trimmed string:" + trimString.trim());
	}
}