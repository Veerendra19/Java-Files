import java.util.Scanner;
class Test{
public static void main(String[] args){
	Scanner myObj = new Scanner(System.in);
System.out.println("Name,RegNo,Total,Avg,Percentage");
String Name = myObj.nextLine();
int RegNo = myObj.nextInt();
int sum=0;
int avg=0; 
int a= myObj.nextInt();
int[] arr = new int [a] ;  
for(int i=0; i< arr.length ; i++)   
{   
arr[i]=myObj.nextInt();  
sum = sum +arr[i];
}  
int total = myObj.nextInt();
System.out.print(sum+" is your TOTAL score"+"\n");
System.out.print(sum/arr.length+" is your Average"+"\n");
System.out.print(((sum*100)/total)+" is your Percentage");
  }
}
