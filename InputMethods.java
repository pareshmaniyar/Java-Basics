import java.util.Scanner;
class InputMethods{
	public static void main( String[] arg){
		//1. reading a string line
		//2. converting it into an array of char
		//3. converting it into an array of int
		//4. converting it into an array of ASCII int
		//5.1 reading a char
		//5.2 reading a char array
		//5.3 convert to uppercase/lowercase/camel case
		//6. reading an int strictly
		//7. reading a long
		//8. reading a float
		//9. use trim
		//10. print everything
		Scanner sc = new Scanner(System.in);
		//1. reading a string line
		String StringLine = sc.next();							
		//2. converting it into an array of char	
		char [] convertingToCharArray = StringLine.toCharArray();
		int n = StringLine.length();
		//3. converting it into an array of int
		int [] convertingToIntArray = new int [n];
		for(int i=0; i<n; i++){
			convertingToIntArray[i] = Character.getNumericValue(StringLine.charAt(i));
		}
		//4. converting it into an array of ASCII int
		int [] convertingToASCIIArray =new int [n]; 
		for(int i=0; i<n; i++){
			convertingToASCIIArray[i] = (int)StringLine.charAt(i); 
		}
		//5.1 reading a char
		char readchar;
		readchar = sc.next(".").charAt(0);
		//5.2 reading a char array
		char [] chararray = sc.next().toCharArray();
		//5.3 convert to uppercase/lowercase/camel case
		//10. print everything
		System.out.println(StringLine + " StringLine ");
		for(int i=0; i<n; i++){
			System.out.println(convertingToCharArray[i] +" convertingToCharArray "+ i);
		}
		for(int i=0; i<n; i++){
			System.out.println(convertingToIntArray[i] + " convertingToIntArray " + i);
		}
		for(int i=0; i<n; i++){
			System.out.println(convertingToASCIIArray[i] + " convertingToASCIIArray " + i);
		}
		System.out.println(readchar + " readchar ");
	}
}