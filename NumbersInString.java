import java.util.Scanner;
public class NumbersInString {
   public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	int len=s1.length();
	int count=0;
	for (int i=0;i<len;i++){
		if (s1.charAt(i)>='0' && s1.charAt(i)<='9')
			count=count+1;
	}
System.out.println(count);
   }
}