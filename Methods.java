import java.util.Scanner;
class Methods{
	private int n;
	public void setn(int x){
		n = x;
	}
	public int getn(){
		return n;
	}
	public static void main( String [] args){
		Methods k = new Methods();
		k.n = 0;
		k.setn(100);
		int f = k.getn();
		System.out.println(f);
		Scanner sc = new Scanner(System.in);
		k.setn(Integer.parseInt(sc.nextLine()));
		System.out.println(k.getn());
	}
}