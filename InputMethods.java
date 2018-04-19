import java.util.Scanner;
class InputMethods{
	public static void main( String[] arg){
		//1. reading a string line
		//2. converting it into an array of char
		//3. converting it into an array of int
		//4. converting it into an array of ASCII int
		//5.1 reading a char
		//5.2 reading a char array
		//5.3 convert to uppercase/lowercase
		//6. reading an int strictly
		//7. reading a long
		//8. reading a float
		//9. use trim
		//use replace
		//use split
		/* 
		*/
		//use regex
		/*difference between next and nextline: next() can read the input only till the space.
		 It can't read two words separated by a space. Also, next() places the cursor in the same 
		 line after reading the input.nextLine() reads input including space between the words 
		 (that is, it reads till the end of line \n). Once the input is read, nextLine() positions the 
		 cursor in the next line.
		*/
		//10. print everything
		Scanner sc = new Scanner(System.in);
		System.out.println("reading a string line");
		String StringLine = sc.nextLine();

		System.out.println("converting it into an array of char");
		char [] convertingToCharArray = StringLine.toCharArray();
		int n = StringLine.length();
		System.out.println("converting it into an array of int");
		int [] convertingToIntArray = new int [n];
		for(int i=0; i<n; i++){
			convertingToIntArray[i] = Character.getNumericValue(StringLine.charAt(i));
		}
		System.out.println("converting it into an array of ASCII int");
		int [] convertingToASCIIArray = new int [n]; 
		for(int i=0; i<n; i++){
			convertingToASCIIArray[i] = (int) StringLine.charAt(i); 
		}
		System.out.println("reading a char ");
		char readchar;
		readchar = sc.next(".").charAt(0);

		System.out.println("reading a char array ");
		char [] charArray = sc.next().toCharArray(); sc.nextLine();
		int cn = charArray.length;
		System.out.println("reading two seperate lines int strictly ");
		int inputi = Integer.parseInt(sc.nextLine());
		
		System.out.println("inputi " + inputi );// works well, throws an error
		while(!sc.hasNextInt()){
			sc.next();
		}
		int iinput = Integer.parseInt(sc.nextLine());

		System.out.println("iinput " + iinput ); // works well, keeps on asking for an int value
		System.out.println("reading two int strictly on a single line speratetd by space");
		int f1 = sc.nextInt(); int f2 = sc.nextInt(); sc.nextLine();
		//long
		System.out.println("Type float " );
		System.out.println("Your float " + Float.parseFloat(sc.nextLine()));
		//float
		System.out.println("Type Double ");
		Double inputDouble = Double.parseDouble(sc.nextLine());
		System.out.println("Your Double " + inputDouble);
		//trim- The trim( ) method returns a copy of the invoking string from which any leading and trailing whitespace has been removed
		System.out.println("Type String to trim ");
		String trimxString = sc.nextLine();
		String trimmed = trimxString.trim();
		System.out.println("Your Trimmed string:");
		//replace
		System.out.println("Type String to replace all the vowels with * and split at spaces");
		String replaceString = sc.nextLine();
		System.out.println(replaceString.replaceAll("[aeiou]", "*"));//only replace('a', '*');
		//split
		System.out.println("Type string to split based on for");
		String StringSplit = sc.nextLine();
		String [] StringArray = StringSplit.split("for");
		for(String a: StringArray) System.out.println(a);
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
		for(int i=0; i<cn; i++){
			System.out.println(charArray[i] + "  " + i);
		}
		System.out.println(StringLine.toUpperCase() + " String Into uppercase ");
		for(int i=0; i<cn; i++){
			System.out.println(Character.toUpperCase(charArray[i]) + " Character into uppercase " + i);
		}

	}
}