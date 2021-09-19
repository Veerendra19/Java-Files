import java.util.Scanner;
class Position{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st1=sc.nextLine();
		char ch=sc.next().charAt(0);
		if (st1.indexOf(ch)==-1){
			System.out.println("Charter not found");}
		else if (st1.indexOf(ch)==st1.lastIndexOf(ch)){
		System.out.println(st1.indexOf(ch));}
		else 
		System.out.println("Char occured more than once at"+st1.indexOf(ch)+"and also at"+st1.lastIndexOf(ch));
	}
} 