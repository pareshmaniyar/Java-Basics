import java.util.Scanner;
class Recursion{
	public static int sfac(int n){
		if(n==1){
			return n;
		}else{
			return (n*sfac(n-1));
		}
	}
	public int fac(int n){
		if(n==1){
			return n;
		}else{
			return (n*fac(n-1));
		}
	}
	public static void main(String [] args){
		Recursion r = new Recursion();
		Scanner sc = new Scanner(System.in);
		System.out.println(r.fac(Integer.parseInt(sc.nextLine())));
		System.out.println(sfac(5));
	}
}