import java.util.Scanner;
class StringChange{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println("Uppercase : "+str1.toUpperCase());
		System.out.println("Lowercase : "+str1.toLowerCase());
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(str1.length())/2);
		System.out.println(str1.charAt(str1.length())-1);
}
}